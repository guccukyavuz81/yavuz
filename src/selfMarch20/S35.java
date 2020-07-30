package selfMarch20;
 interface Exportable{
	 void export();
 }
public class S35 implements Exportable{
	
public void export()	{
	System.out.println("Tool: export");
}
public static void main(String[] args) {
	S35 aTool=new ReportTool();
	S35 bTool=new S35();
    callExport(aTool);
    callExport(bTool);
	
	
}
public static void callExport(Exportable ex) {
	ex.export();
}
}
class ReportTool extends S35 implements Exportable{
	public void export() {
		System.out.println("RTool:export");
	}
	
}

