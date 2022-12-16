/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergetwosortedlists;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	
        ListNode output=new ListNode();
		//result list is the extra space used here
        ListNode result=output;
        while(list1!=null || list2!=null){
            if(list1!=null && list2!=null){
                if(list1.val<list2.val){
                    ListNode node =new ListNode(list1.val);
                    result.next=node;
                    result=result.next;
                    list1=list1.next;
                }else if(list1.val>list2.val){
                    ListNode node =new ListNode(list2.val);
                    result.next=node;
                    result=result.next;
                    list2=list2.next;
                }else{
                    ListNode node1 =new ListNode(list1.val);
                    ListNode node2 =new ListNode(list2.val);
                    result.next=node1;
                    result=result.next;
                    result.next=node2;
                    result=result.next;
                    list1=list1.next;
                    list2=list2.next;
                }    
            }
            if(list1==null){
                while(list2!=null){
                    ListNode node =new ListNode(list2.val);
                    result.next=node;
                    result=result.next;
                    list2=list2.next;                    
                }
            }
            if(list2==null){
                while(list1!=null){
                    ListNode node =new ListNode(list1.val);
                    result.next=node;
                    result=result.next;
                    list1=list1.next;                    
                }
            }
            
        }
        return output.next;
    }
}