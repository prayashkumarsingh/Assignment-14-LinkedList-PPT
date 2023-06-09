package in.ineuron.question;
import java.util.*;

public class Question8 {
	public ListNode rZSS(ListNode head) {
	    ListNode dummy = new ListNode(0, head);
	    int prefix = 0;
	    Map<Integer, ListNode> prefixToNode = new HashMap<>();
	    prefixToNode.put(0, dummy);

	    for (; head != null; head = head.next) {
	      prefix += head.val;
	      prefixToNode.put(prefix, head);
	    }

	    prefix = 0;

	    for (head = dummy; head != null; head = head.next) {
	      prefix += head.val;
	      head.next = prefixToNode.get(prefix).next;
	    }

	    return dummy.next;
	  }
}
