package data;

public class Read_Write_ExcelFile {

	public static void main(String[] args) {
		
		Xls_Reader d = new Xls_Reader ("C:\\Testing\\NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 3));
		String correctEmail = d.getCellData("Data1", 1, 2);
		System.out.println(correctEmail);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
		d.setCellData("Data1", "Name", 11, "asshole");
		d.addColumn("Data1", "Rishit");
		

	}

}
