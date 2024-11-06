import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 

public class BST<E extends Comparable<E>> {
    E root; 
    BST<E> left; 
    BST<E> right; 

    public BST() {
        this.root = null; 
        this.left = null; 
        this.right = null; 
    }

    public BST(E rootItem) {
        this.root = rootItem;  
    }

    public boolean isEmpty() {
        return (this.root == null); 
    }  
    
    public void makeEmpty() {
        this.root = null; 
        this.left = null; 
        this.right = null; 
    }

    // will not add an item that already appears in the tree
    public void insert(E item) {
        if (this.root == null) {
            this.root = item; 
        } else {
            if (this.root.compareTo(item) > 0) { // item is less than rootItem
                this.left.insert(item); 
            } else if (this.root.compareTo(item) < 0) {
                this.right.insert(item); 
            } // inner if-else block
        } // if-else block
    } // end insert method

    public E min() throws Exception {
        if (!this.isEmpty()) {
            if (this.left == null) {
                return this.root; 
            } else {
                return this.left.min(); 
            }
        } else {
            throw new Exception("cannot find the min of an empty tree!"); 
        } 
    }

    public void remove(E item) throws Exception {
        if (this.root != null) {
            if (this.root.compareTo(item) > 0) {
                this.left.remove(item); 
            } else if (this.root.compareTo(item) < 0) {
                this.right.remove(item); 
            } else {
                this.removeHelper(); 
            }
        }

    }

    private void removeHelper() throws Exception {
        if (this.left == null && this.right == null) {
            this.root = null; 
        } else if (this.right == null) {
            this.root = this.left.root; 
            this.right = this.left.right; 
            this.left = this.left.left; 
        } else {
            E replacement = this.right.min(); // the minimum value larger than the root will replace the root
            this.right.remove(replacement); 
            this.root = replacement; 
        }


    }

    // preorder orders like this: root, left, right
    public String preorder() {
         StringBuilder preorderStr = new StringBuilder(); 

         if (!this.isEmpty()) {
         preorderStr.append(this.root.toString());
            if (this.left != null) {
                preorderStr.append(", ").append(this.left.preorder()); 
            }
            if (this.right != null) {
                preorderStr.append(", ").append(this.right.preorder()); 
            }
         }
         return preorderStr.toString(); 
        
    }
    
}
