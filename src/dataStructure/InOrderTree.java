package dataStructure;

public class InOrderTree {

	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
		
		public void insert(int value) {
			if (value <= data) {
				if (left == null) {
					left = new TreeNode(value);
				} else {
					left.insert(value);
				}
			} else {
				if (right == null) {
					right = new TreeNode(value);
				} else {
					right.insert(value);
				}
			}
		}
		
		public boolean contains(int value) {
			if (data == value) {
				return true;
			} else if (value < data) {
				if (left == null) {
					return false;
				}
				return left.contains(value);
			} else {
				if (right == null) {
					return false;
				}
				return right.contains(value);
			}
		}
	}
}
