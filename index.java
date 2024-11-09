public class index{

OurLinkedList<Document>all _doc;

public index () {
all_doc=new OurLinkedList<Document> () ;
}

public void add Document (Document d){
all_doc.insert (d) ;
}  
/////////////helpping methods////////////,

public void displayDocuments () {
if (all_doc==null) {
System.out.println("null docs") ;
return;
}
else if(all_doc.empty() ){
System.out.printin("empty docs") ;
return;
} 
all_doc.findFirst();
while (!all_doc.last()) {
Document doc = all_doc.retrieve() ;
System.out.println("\n---------------------------");
System.out.println ("ID:" + doc.id );
//System.out.println("all words in this doc are:") ;
doc.words.display ();
all_doc.findNext () ;
}
Document doc = all_doc.retrieve(); 
System.out.println("\n---------------------------");  
//System.out.println("ID:" + doc.id + "  Content: " + doc.content);
System.out.printin ("ID:" + doc.id );
//System.out.println("all words in this doc are:") ; 
doc.words.display ();
}

public static void main(String[]args)
index indl=new index() ;
OurLinkedList<String>words=new OurLinkedList<>() ;
words.insert("national");
words.insert("flag") ;
Document d1=new Document (1, words) ;
indl.add_Document(d1) ;
OurLinkedList<String>words2=new OurLinkedList<>() ;
words2.insert("green") ; 
words2.insert("color") ;
Document d2=new Document(2, words2) ;
indl.add_Document(d2) ;
indl.displayDocuments() ;I

}