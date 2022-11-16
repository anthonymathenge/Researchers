/**
 * This class creates a tree and uses an
 * inorder traversal to print out the tree nodes
 * @author Anthony Mathenge
 */

import java.util.ArrayList;
import java.util.Stack;

public class BST {
    BSTNode root;
    public BST(){
    }

    /**
     *
     * @param p the profile
     *
     * this method takes in parameter p and
     * inserts p into the tree in its right position
     */
    public void insertResearcher(Profile p){
        BSTNode newbstnode = new BSTNode(p);
        if (root==null) {
            root = newbstnode ;
        }else {
            createtree(root,newbstnode);
        }
    }

    /**
     *
     * @param node the current node
     * @param newbstnode the node being added
     * this method creates a tree by comparing a certain newbstnode to
     * the node then determines where it should be placed in the tree it
     * does this recursively.
     */
    private void createtree( BSTNode node,BSTNode newbstnode){
        int compare = node.getResearcher().familyNames.compareToIgnoreCase(newbstnode.getResearcher().familyNames);
        if (compare < 0){
            if (node.getR()!=null){
                createtree(node.r,newbstnode);
            }else{
                node.setR(newbstnode);
            }
        }else {
            if (node.getL()!=null){
                createtree(node.l,newbstnode);
            } else {
                node.setL(newbstnode);

            }


        }

    }

    /**
     * this method calls the other method printAlphabetical,
     * although it has no attributes
     * @return
     */
    public String printAlphabetical(){
        ArrayList<String> name ;
        name= printAlphabetical(root);
        StringBuilder sb = new StringBuilder();
        for (String s: name){
            sb.append(s+"\n");
        }
        return sb.toString();
    }

    /**
     * this method does an inorder traversal
     * @param newbstnode starting node
     * @return the nodes of the tree in alphabetical order
     */
     private ArrayList<String> printAlphabetical(BSTNode newbstnode){
         ArrayList<String> name = new ArrayList<>();
         Stack < BSTNode> s = new Stack<>();
         while(true){
             if(newbstnode!= null){
                 s.push(newbstnode);
                 newbstnode=newbstnode.getL();
             }else{
                 if(s.isEmpty()) break;
                 newbstnode=s.peek();
                 name.add(newbstnode.getResearcher().familyNames + ", " + newbstnode.getResearcher().givenNames);
                 s.pop();
                 newbstnode=newbstnode.getR();
             }
         }
         return name;
     }
     }


