package S2W12.Lab;

import java.util.ArrayList;

public class BTS<E extends Comparable<E>> {
    TreeNode<E> root;
    int size;

    public BTS() {};

    public boolean search(E e) {
        TreeNode<E> current = root;

        while(current != null) {
            if(current.element.compareTo(e) > 0) {
                current = current.left;
            } else if (current.element.compareTo(e) < 0) {
                current = current.right;
            } else {
                return true;
            }
        }

        return false;
    }

    public boolean insert(E e) {

        if(root == null) {
            root = new TreeNode<>(e);
        } else {
            TreeNode<E> current = root;
            TreeNode<E> parent = current;

            while (current != null) {
                if(current.element.compareTo(e) > 0) {
                    parent = current;
                    current = current.left; 
                } else if (current.element.compareTo(e) < 0) {
                    parent = current;
                    current = current.right; 
                } else {
                    return false;
                }
            }

            if(parent.element.compareTo(e) > 0) {
                parent.left = new TreeNode<>(e);
            } else {
                parent.right = new TreeNode<>(e);
            }
        }

        size++;
        return true;
    }

    public int getSize() {
        return size;
    }

    public int height() {return height(root);}

    private int height(TreeNode<E> node) {
        if(node == null) {
            return -1;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public E getRoot() {
        return root.element;
    }

    public E minValue() {

        if(root == null) return null;
        TreeNode<E> current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current.element;
    }

    public E maxValue() {
        if(root == null) return null;
        TreeNode<E> current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.element;
    }

    public ArrayList<TreeNode<E>> path(E e) {
        if(root == null) return null;
        if(search(e) == false) return null;

        ArrayList<TreeNode<E>> path = new ArrayList<>();
        TreeNode<E> current = root;
        Boolean found = false;
        while (found == false) {
            if(current.element.compareTo(e) > 0) {
                path.add(current);
                current = current.left;
            } else if (current.element.compareTo(e) < 0) {
                path.add(current);
                current = current.right;
            } else {
                path.add(current);
                found = true;
            }
        }
        return path;
    }

    public boolean delete(E e) {
        if(root == null) {
            return false;
        } 

        if(search(e) == false) return false;


        TreeNode<E> parent = root;
        TreeNode<E> current = root;

        while (current.element.compareTo(e) != 0) {
            if(current.element.compareTo(e) > 0) {
                parent = current;
                current = current.left; 
            } else if (current.element.compareTo(e) < 0) {
                parent = current;
                current = current.right; 
            }
        }

        if(current.left == null && current.right == null) {
            if(current == root) {
                root = null;
            } else if(current == parent.left) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        else if(current.left == null) {
            if(current == root) {
                root = current.right;
            } else if(current == parent.left) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        else if(current.right == null) {
            if(current == root) {
                root = current.left;
            } else if(current == parent.left) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else {

            // find the node in the right subtree
            TreeNode<E> successorParent = current;
            TreeNode<E> successor = current.right;

            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            current.element = successor.element;

            // Remove the successor node
            if (successorParent.left == successor) {
                successorParent.left = successor.right;
            } else {
                successorParent.right = successor.right;
            }

        }

        return true;
    }

    public boolean clear() {
        if(root == null) return false;

        root = null;
        return true;
    }

    protected void inorder(TreeNode<E> root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    protected void preorder(TreeNode<E> root) {
        if(root == null) return;

        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    protected void postorder(TreeNode<E> root) {
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }


}
