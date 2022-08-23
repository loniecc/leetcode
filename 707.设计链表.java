/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start
class MyLinkedList {

    int size;
    Node preHead = new Node(-1, null);

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        System.out.println(index +" "+size);
        if(index >= size){
            return -1;
        }
        Node node = preHead.next;
        while(index > 0){
            node = node.next;
            index--;
        }
        return node.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val, preHead.next);
        preHead.next = node;
        size++;
    }
    
    public void addAtTail(int val) {
        Node node = preHead.next;
        if(node != null){
            while(node != null) {
                if(node.next == null){
                    node.next = new Node(val, null);
                    break;
                }
                node = node.next;
            }
        }else{
            preHead.next = new Node(val,null);
        }
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0) {
            addAtHead(val);
        }else if(index == size){
            addAtTail(val);
        }else if(index < size){
            Node node = preHead.next;
            Node preNode = preHead;
            while(index > 0){
                node = node.next;
                preNode = preNode.next;
                index --;
            }
            Node newNode = new Node(val, node);
            preNode.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        System.out.println(index +" "+size);
        if(index >= 0 && index < size){
            Node node = preHead.next;
            Node preNode = preHead;
            while(index > 0){
                node = node.next;
                preNode = preNode.next;
                index --;
            }
            preNode.next = node.next;
            
            size--;
        }
    }

    public static class Node { 
        int val;
        Node next;

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

