class Node 
{
    int value;
    Node next;

    Node(int val) 
    {
        value = val;
        next = null;
    }
}

public class Linkedlist 
{
    Node head;
    Node tail;
    int n;

    LL() 
    {
        head = null;
        tail = null;
        n = 0;
    }

    void add(int val)
	{
	    Node node = new Node(val);
	    if(head == null)
	    {
	        //node.next = head;
	        head = node;
	        tail = node;
	    }
	    else{
	        tail.next = node;
	        tail=node;
	    }
	    n++;
	}    
	void push(int val)
	{
		Node new_node = new Node(val);
		new_node.next = head;
		head = new_node;
		tail=new_node;
		n++;
	}
	
	void end(int val)
	{
		Node new_node = new Node(val);
		
		if(head == null)
		{
			head = new_node;
		}
		
		else
		{
			Node curr = head;
			while(curr.next != null)
			{
				curr = curr.next;
			}
			
			curr.next = new_node;
		}
		n++;
	}
	
	void insert(int data, int value)
	{
		if (head== null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		
		Node curr = head, preNode= null;
		Node new_node = new Node(data);
		
		while(curr != null)
		{
			if(curr.value == value)
			{
				break;
			}
			preNode = curr;
			curr = curr.next;
		}
		
		if(curr!=null)
		{
			if(curr!=head)
			{
				new_node.next = preNode.next;
				preNode.next = new_node;
			}
			else
			{
				new_node.next = head;
				head = new_node;
			}
			n++;
		}
		
		else
		{
			System.out.println("data is empty");
		}
		
	}
	
	void deleteHead()
	{
		Node curr = head;
		head = curr.next;
		n--;
	}
	
	void deleteMid(int val)
	{
		Node curr = head, preCurr = null;
		if(head == null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		
		while(curr != null)
		{
			if(curr.value == val)
			{
				break;
			}
			preCurr = curr;
			curr = curr.next;
		}
		
		if(curr != null)
		{
			if(curr != head)
			{
				preCurr.next = curr.next;
			}
			else
			{
				head = curr.next;
			}
			n--;
		}
		
		else
		{
			System.out.println("data is empty");
		}
	}
	
	void deleteEnd()
	{
		if(head == null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		
		if (head.next == null)
		{
			head = null;
		}
		
		else
		{
			Node curr = head, preCurr = null;
			
			while(curr.next != null)
			{
				preCurr = curr;
				curr = curr.next;
			}
			preCurr.next = null;
		}
		n--;
	}
	
	void insert_idx(int idx, int data)
	{
		if(head == null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		
		if(idx >= 0 && idx <= n)
		{
			Node new_node = new Node(data);
			Node curr = head;
			
			if(idx==0)
			{
				new_node.next = head;
				head = new_node;
			}
			
			else
			{
				Node precurr = null;
				int i = 0;
			
				while(i<=idx)
				{
					if(i==idx)
					{
						break;
					}
					precurr = curr;
					curr = curr.next;
					i++;
				}
				new_node.next = precurr.next;
				precurr.next = new_node;
			}
			n++;
		}
		else
		{
			System.out.println("given value cannot be negative or un range");
		}
	}
	
	void search(int idx)
	{
		if(head == null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		
		if(idx >= 0 && idx <= n)
		{
			Node curr = head;
			int i = 0;
			while (curr!= null)
			{
				if(i == idx)
				{
					System.out.println(curr.value);
					break;
				}
				curr = curr.next;
				i++;
			}
		}
		else
		{
			System.out.println("given value cannot be negative or un range");
		}
	}
	
	void replaceAll(int val, int data)
	{
		if (head== null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		
		Node curr = head;
		
		while(curr != null)
		{
			if(curr.value == val)
			{
				curr.value = data;
			}
			curr = curr.next;
		}
	}
	
	void replace(int idx, int data)
	{
		if (head== null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		
		if(idx >= 0 && idx <= n)
		{
			Node curr = head;
			int i = 0;
			while (curr!= null)
			{
				if(i == idx)
				{
					curr.value = data;
					break;
				}
				curr = curr.next;
				i++;
			}
		}
		else
		{
			System.out.println("given value cannot be negative or un range");
		}
	}
	
	void reverse()
	{
		Node nxt = null, curr = head, prev = null;
		
		while (curr!= null)
		{
			nxt = curr.next;	//use to store next node
			curr.next = prev;  //override the address of next node by prev node
			
			prev = curr;  //store the curr node for give the addresh of that node to next node
			
			curr = nxt; //go to the next node
        }
        head = prev;
	}
	
	void clear()
	{
		head = null;
	}
	
	void seq()
	{
		if (head == null) 
		{
            System.out.println("List is empty");
            return;
        }
        
		Node curr = head;
        
		while (curr!= null)
		{
			System.out.print(curr.value);
            curr = curr.next;
            if (curr != null) {
                System.out.print("->");
            }
        }
        System.out.println();
	}
	
	int length()
	{
		return n;
	}
	
	void get()
	{
		Node curr = head;
        
		while (curr!= null)
		{
			System.out.println(curr.value);
			curr = curr.next;
		}
		//n++;
	}
	
	public static void main(String[] args) 
	{
		Linkedlist l = new Linkedlist();
		l.add(1);
		l.add(2);
		l.add(3);
		l.push(5);
		l.get();
		//l.end(5);
//		l.end(6);
//		l.insert(2, 5);
//		l.get();
		
		System.out.println("\n");
		//l.deleteHead();
		//l.deleteMid(6);
		//l.deleteEnd();
		
		//l.insert_idx(-9, 7);
		System.out.println("\n");
		//l.search(2);
		//l.replaceAll(2, 7);
		//l.replace(1,16);
		//l.clear();
		//l.reverse();
//		l.seq();
		
		//System.out.println(l.length());
	}
	
	/*public static void main(String[] args) 
	{
		node n1 = new node(5);
		node n2 = new node(6);
		node n3 = new node(7);
		
		System.out.println("n1: "+n1.value);
		System.out.println("n2: "+n2.value);
		System.out.println("n3: "+n3.value);

		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
		System.out.println("n3: "+n3);
		
		n1.next = n2;
		n2.next = n3;
		
		System.out.println("n1 next: "+n1.next);
		System.out.println("n2 next: "+n2.next);
		System.out.println("n3 next: "+n3.next);
	}*/
}
