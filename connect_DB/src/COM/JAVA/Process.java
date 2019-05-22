/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.JAVA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author DUC
 */
public class Process {

    public ResultSet ex6(String bookName, String date) throws Exception {
        DB_Conector dbconnector = new DB_Conector();
        Connection conn = dbconnector.getconnection();
        String sql = "select d.ten from PHIEUMUON p \" +\n"
                + "                    \"join SACH s on s.masach = p.masach \" +\n"
                + "                    \"join DOCGIA d on d.sothe = p.sothe \" +\n"
                + "                    \"where s.ten = ? and p.ngaymuon = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, bookName);
        pstmt.setString(2, date);
        return pstmt.executeQuery();

    }
public ResultSet ex7()throws Exception
{
DB_Conector dbconnector = new DB_Conector();
Connection conn = dbconnector.getconnection();
String sql = "select d.sothe,d.ten,s.ten from PHIEUMUON p"
        + "join SACH s on s.masach = p.masach"
        + "join DOCGIA d on d.sothe=p.sothe"
        + "where p.ngaymuon between '2019-04-01'and '2019-04-30'";
        PreparedStatement pstmt = conn.prepareStatement(sql);
         return pstmt.executeQuery();
}
public ResultSet ex8() throws Exception
{
    DB_Conector dbcon= new DB_Conector();
   Connection con = dbcon.getconnection();
   String sql = "select * from SACH s"
           + "where s.masach not in (select masach from PHIEUMUON)";
   PreparedStatement pstmt = con.prepareStatement(sql);
    return pstmt.executeQuery();
}
public ResultSet ex9() throws Exception
{
    DB_Conector dbcon= new DB_Conector();
   Connection con = dbcon.getconnection();
   String sql = "select count(*) as  'so luong' from PHIEUMUON p "
           + "join DOCGIA d on d.sothe=p.sothe"
           + "where d.ten='DUC'";
           
   PreparedStatement pstmt = con.prepareStatement(sql);
    return pstmt.executeQuery();
}
public ResultSet ex10() throws Exception
{
    DB_Conector dbcon= new DB_Conector();
   Connection con = dbcon.getconnection();
   String sql = "select d * from PHIEUMUON p"
           + "join DOCGIA d on d.sothe=p.sothe"
           + "where p.ngaytra is null";
           
   PreparedStatement pstmt = con.prepareStatement(sql);
    return pstmt.executeQuery();
}
}
