package buiphuongnga.com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import buiphuongnga.com.module.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham>dsSP = new ArrayList<SanPham>();
		dsSP.add(new SanPham(1,"Coca",25));
		dsSP.add(new SanPham(2,"Pepsi",15));
		dsSP.add(new SanPham(3,"Redbull",20));
		System.out.println("Danh sach sản phẩm");
		for(SanPham sp:dsSP)
			System.out.println(sp);
		Collections.sort(dsSP);
		System.out.println("Danh sách sản phẩm sau khi sort: ");
		for(SanPham sp:dsSP)
			System.out.println(sp);
		

	}

}
