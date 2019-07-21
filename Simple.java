import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Simple implements ActionListener
{
JMenu menu,submenu1;
JMenuItem i1, i2, i3, i4;
JLabel l=new JLabel();
JFrame f= new JFrame("Online Ticket Booking");
JButton b9=new JButton("RESERVATION");
JButton b10=new JButton("TIMETABLE");
ImageIcon water = new ImageIcon("d1.jpg");
JButton b11 = new JButton(water);
Simple()
{
Image icon = Toolkit.getDefaultToolkit().getImage("C:\\d2.png");
JMenuBar mb=new JMenuBar();
menu=new JMenu("TicketBooking");
submenu1=new JMenu("Bus");
i1=new JMenuItem(" Bus Reservation");
i1.addActionListener(this);
i2=new JMenuItem("Bus TimeTable");
i2.addActionListener(this);
menu.add(submenu1);
submenu1.add(i1);
submenu1.add(i2);
mb.add(menu);
l.setBounds(150,0,600,20);
f.add(l);
String data = "WELCOME TO ONLINE TICKET BOOKING ";
l.setText(data);
l.setFont(new Font("Courier New", Font.BOLD, 25));
f.setIconImage(icon);
JButton b2=new JButton("HOME");
b2.setBounds(0,30,90,50);
f.add(b2);
b2.addActionListener(this);
b9.setBounds(90,30,90,50);
f.add(b9);
b9.addActionListener(this);
b10.setBounds(180,30,90,50);
f.add(b10);
b10.addActionListener(this);
b11.setBounds(0,80,800,500);
f.add(b11);
b11.addActionListener(this);
f.setJMenuBar(mb);
f.setSize(800,600);
f.setLayout(null);
f.setVisible(true);
f.setResizable(false);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()== i1)
{
new Simple1();
}
else if(e.getSource()==b9)
{
new Simple1();
}
else if(e.getSource()==b11)
{
new Simple1();
}
else if(e.getSource()==b10)
{
JFrame f3=new JFrame();
String data[][]={ {"1001","Nanded To Mumbai","7:30AM 3:40PM 12AM"},
{"1001","Mumbai To Nanded","12AM 10PM 3AM"},
{"1002","Nanded To Solapur","4:30AM 5:35PM 12AM"},{"1002","Solapur To Nanded","4:30PM 5:35AM 12PM"},

{"1003","Solapur To Mumbai","4:30AM 9:30PM 12:50PM"},{"1003","Mumbai To Solapur","1PM 2AM 10AM"}};
String column[]={"BUS NO","LOCATION","TIME"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp=new JScrollPane(jt);
f3.add(sp);
f3.setSize(800,600);
f3.setVisible(true);
f3.setResizable(false);
}
else if(e.getSource()==i2)
{
JFrame f3=new JFrame();
String data[][]={ {"1001","Nanded To Mumbai","7:30AM 3:40PM 12AM"},
{"1001","Mumbai To Nanded","12AM 10PM 3AM"},
{"1002","Nanded To Solapur","4:30AM 5:35PM 12AM"},{"1002","Solapur To Nanded","4:30PM 5:35AM 12PM"},

{"1003","Solapur To Mumbai","4:30AM 9:30PM 12:50PM"},{"1003","Mumbai To Solapur","1PM 2AM 10AM"}};
String column[]={"BUS NO","LOCATION","TIME"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp=new JScrollPane(jt);
f3.add(sp);
f3.setSize(800,600);
f3.setVisible(true);
}
else
{
new Simple();
}
}
public static void main(String args[])

{
new Simple();
}
}
class Simple1 extends Simple
{
String country[]={"Solapur","Nanded","Mumbai"};
String country1[]={"Nanded","Solapur","Mumbai"};
JComboBox cb=new JComboBox(country);
JComboBox cb1=new JComboBox(country1);
JFrame f1=new JFrame("BUS TICKET");
JButton b3=new JButton("SUBMIT");
JButton b1=new JButton("HOME");
JTextField t5=new JTextField();
JLabel l3=new JLabel("StartLocation");
JButton b4=new JButton("REFRESH");
JTextField t1=new JTextField();
JTextField t2=new JTextField();
JLabel l6=new JLabel("TIME");
String country3[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
JComboBox cb3=new JComboBox(country3);
String country4[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
JComboBox cb4=new JComboBox(country4);
String country5[]={"1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
JComboBox cb5=new JComboBox(country5);
JLabel l7=new JLabel("DOB");
JButton b5=new JButton("STATUS");
JButton b12=new JButton("PROCEED");
Simple1()
{
f1.setSize(800,600);
f1.setLayout(null);
f1.setVisible(true);
f1.setResizable(false);
cb.setBounds(150, 200,90,20);
f1.add(cb);
cb1.setBounds(370, 200,90,20);
f1.add(cb1);
t5.setBounds(210,380,300,30);
f1.add(t5);
JLabel l4=new JLabel("Destination");
l4.setBounds(270,200,90,20);
f1.add(l4);
b1.setBounds(0,0,90,50);
f1.add(b1);
b1.addActionListener(this);
JLabel l1=new JLabel("NAME");
JLabel l2=new JLabel("LASTNAME");
l1.setBounds(100,150,70,20);
l2.setBounds(290,150,70,20);
f1.add(l1);
f1.add(l2);

l3.setBounds(50,200,90,20);
f1.add(l3);
t1.setBounds(150,150,90,20);
t2.setBounds(365,150,90,20);
f1.add(t1);
f1.add(t2);
b3.setBounds(260,240,90,50);
f1.add(b3);
b3.addActionListener(this);
b4.setBounds(90,0,90,50);
f1.add(b4);
b4.addActionListener(this);
l6.setBounds(280,320,70,20);
f1.add(l6);
cb3.setBounds(530, 200,40,20);
cb4.setBounds(570, 200,40,20);
cb5.setBounds(610, 200,60,20);
f1.add(cb3);
f1.add(cb4);
f1.add(cb5);
l7.setBounds(490,200,40,20);
f1.add(l7);
b5.setBounds(700,0,90,50);
f1.add(b5);
b5.addActionListener(this);
b12.setBounds(610,0,90,50);
f1.add(b12);
b12.addActionListener(this);
String data1 = "Please enter the STATUS Button before PROCEED Button and Fill All Information Correctly ";
JLabel l66=new JLabel(data1);
l66.setFont(new Font("Courier New", Font.BOLD,14));
l66.setBounds(20,450,760,20);
f1.add(l66);
}
public void actionPerformed(ActionEvent e1)
{
if(e1.getSource()==b1)
{
new Simple();
}
else if(e1.getSource()==b12)
{
if(t1.getText().length()==0 || t2.getText().length()==0)
{
JOptionPane.showMessageDialog(f1,"Please enter all information","Alert",JOptionPane.WARNING_MESSAGE);
}
else
{
JFrame f9=new JFrame("Ticket");
JLabel n10 = new JLabel("Bus-Ticket");
JLabel n12=new JLabel("BUS NO : 1001");
JLabel n1=new JLabel("NAME :");

JLabel n2=new JLabel("LASTNAME :");
JLabel n3=new JLabel("DOB :");
JLabel n4=new JLabel(t1.getText());
JLabel n5=new JLabel(t2.getText());
JLabel n6=new JLabel( cb3.getSelectedItem().toString()+"/"+cb4.getSelectedItem().toString()+"/"+cb5.getSelectedItem().toString());
JLabel n7=new JLabel("Start Location : " + cb.getSelectedItem().toString());
JLabel n8=new JLabel("Destination : " + cb1.getSelectedItem().toString());
JButton m2=new JButton("Print") ;
JLabel n11=new JLabel("TP");
n10.setFont(new Font("French Script MT", Font.BOLD, 46));
n10.setBounds(30,20, 250,35);
n12.setBounds(50,55,150,50);
n1.setBounds(50,90,150,50);
n2.setBounds(50,140,150,50);
n3.setBounds(50,190,150,50);
n4.setBounds(150,75,80,80);
n5.setBounds(150,125,80,80);
n6.setBounds(150,175,80,80);
n7.setBounds(50,250,180,20);
n8.setBounds(50,290,180,20);
m2.setBounds(70,340,90,20);
n11.setBounds(30,90,70,80);
f9.add(n10);
f9.add(n12);
f9.add(n1);
f9.add(n2);
f9.add(n3);
f9.add(n4);
f9.add(n5);
f9.add(n6);
f9.add(n7);
f9.add(n8);
f9.add(m2);
f9.add(n11);
f9.setVisible(true);
f9.setSize(300,400);
f9.setLayout(null);
f9.setResizable(false);

}
}
else if(e1.getSource()==b3)
{
if(t1.getText().length()==0 && t2.getText().length()==0)
{
t1.setText("PLEASE ENTER NAME");

t2.setText("PLEASE ENTER LAST NAME");
if(cb.getSelectedItem()=="Nanded" && cb1.getSelectedItem()=="Mumbai")
{
String country2[]={"7:30 AM","3:40 PM","12 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Mumbai" && cb1.getSelectedItem()=="Nanded")
{
String country2[]={"12 AM","10 PM","3 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Solapur" && cb1.getSelectedItem()=="Nanded")
{
String country2[]={"4:30 PM","5:35 AM","12 PM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Nanded" && cb1.getSelectedItem()=="Solapur")
{
String country2[]={"4:30 AM","5:35 PM","12 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Solapur" && cb1.getSelectedItem()=="Mumbai")
{
String country2[]={"4:30 AM","9:90 PM","12:50 PM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Mumbai" && cb1.getSelectedItem()=="Solapur")
{
String country2[]={"1 PM","2 AM","10 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
if(cb.getSelectedItem()==cb1.getSelectedItem())
{
t5.setText("Invalid Location");
}
}
else if(t1.getText().length()==0)
{
t1.setText("PLEASE ENTER NAME");
if(cb.getSelectedItem()=="Nanded" && cb1.getSelectedItem()=="Mumbai")

{
String country2[]={"7:30 AM","3:40 PM","12 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Mumbai" && cb1.getSelectedItem()=="Nanded")
{
String country2[]={"12 AM","10 PM","3 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Solapur" && cb1.getSelectedItem()=="Nanded")
{
String country2[]={"4:30 PM","5:35 AM","12 PM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Nanded" && cb1.getSelectedItem()=="Solapur")
{
String country2[]={"4:30 AM","5:35 PM","12 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Solapur" && cb1.getSelectedItem()=="Mumbai")
{
String country2[]={"4:30 AM","9:90 PM","12:50 PM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Mumbai" && cb1.getSelectedItem()=="Solapur")
{
String country2[]={"1 PM","2 AM","10 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
if(cb.getSelectedItem()==cb1.getSelectedItem())
{
t5.setText("Invalid Location");
}
}
if( t2.getText().length()==0)
{
t2.setText("PLEASE ENTER LAST NAME");
if(cb.getSelectedItem()=="Nanded" && cb1.getSelectedItem()=="Mumbai")
{
String country2[]={"7:30 AM","3:40 PM","12 AM"};

JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Mumbai" && cb1.getSelectedItem()=="Nanded")
{
String country2[]={"12 AM","10 PM","3 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Solapur" && cb1.getSelectedItem()=="Nanded")
{
String country2[]={"4:30 PM","5:35 AM","12 PM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Nanded" && cb1.getSelectedItem()=="Solapur")
{
String country2[]={"4:30 AM","5:35 PM","12 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Solapur" && cb1.getSelectedItem()=="Mumbai")
{
String country2[]={"4:30 AM","9:90 PM","12:50 PM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Mumbai" && cb1.getSelectedItem()=="Solapur")
{
String country2[]={"1 PM","2 AM","10 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
if(cb.getSelectedItem()==cb1.getSelectedItem())
{
t5.setText("Invalid Location");
}
}
else if(cb.getSelectedItem()==cb1.getSelectedItem())
{
t5.setText("Invalid Location");
}
else
{
if(cb.getSelectedItem()=="Nanded" && cb1.getSelectedItem()=="Mumbai")
{

String country2[]={"7:30 AM","3:40 PM","12 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Mumbai" && cb1.getSelectedItem()=="Nanded")
{
String country2[]={"12 AM","10 PM","3 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Solapur" && cb1.getSelectedItem()=="Nanded")
{
String country2[]={"4:30 PM","5:35 AM","12 PM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Nanded" && cb1.getSelectedItem()=="Solapur")
{
String country2[]={"4:30 AM","5:35 PM","12 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Solapur" && cb1.getSelectedItem()=="Mumbai")
{
String country2[]={"4:30 AM","9:90 PM","12:50 PM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
else if(cb.getSelectedItem()=="Mumbai" && cb1.getSelectedItem()=="Solapur")
{
String country2[]={"1 PM","2 AM","10 AM"};
JComboBox cb2=new JComboBox(country2);
cb2.setBounds(360,320,90,20);
f1.add(cb2);
}
}
}
else if(e1.getSource()==b5)
{
JFrame f2=new JFrame();
if((cb.getSelectedItem()=="Mumbai" && cb1.getSelectedItem()=="Nanded") || (cb.getSelectedItem()=="Nanded" && cb1.getSelectedItem()=="Mumbai"))
{
String data[][]={
{"1001",t1.getText(),t2.getText(),cb3.getSelectedItem().toString()+"/"+cb4.getSelectedItem().toString()+"/"+cb5.getSelectedItem().toString(),cb.getSelectedItem().toString()
}};
String column[]={"BUS NO","NAME","LASTNAME","DOB","START LOCATION","DESTINATION"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);

JScrollPane sp=new JScrollPane(jt);
f2.add(sp);
f2.setResizable(false);
f2.setSize(800,600);
f2.setVisible(true);
}
else if((cb.getSelectedItem()=="Nanded" && cb1.getSelectedItem()=="Solapur") || (cb.getSelectedItem()=="Solapur" && cb1.getSelectedItem()=="Nanded"))
{
String data[][]={
{"1002",t1.getText(),t2.getText(),cb3.getSelectedItem().toString()+"/"+cb4.getSelectedItem().toString()+"/"+cb5.getSelectedItem().toString(),cb.getSelectedItem().toString()
}};
String column[]={"BUS NO","NAME","LASTNAME","DOB","START LOCATION","DESTINATION"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp=new JScrollPane(jt);
f2.add(sp);
f2.setSize(800,600);
f2.setResizable(false);
f2.setVisible(true);
}
else if((cb.getSelectedItem()=="Mumbai" && cb1.getSelectedItem()=="Solapur") || (cb.getSelectedItem()=="Solapur" && cb1.getSelectedItem()=="Mumbai"))
{
String data[][]={
{"1003",t1.getText(),t2.getText(),cb3.getSelectedItem().toString()+"/"+cb4.getSelectedItem().toString()+"/"+cb5.getSelectedItem().toString(),cb.getSelectedItem().toString()}};
String column[]={"BUS NO","NAME","LASTNAME","DOB","START LOCATION","DESTINATION"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp=new JScrollPane(jt);
f2.add(sp);
f2.setSize(800,600);
f2.setResizable(false);
f2.setVisible(true);
}
}
else if(e1.getSource()==b4)
{
t1.setText(" ");
t2.setText(" ");
t5.setText(" ");
new Simple1();
}
else if(cb.getSelectedItem()==cb1.getSelectedItem())
{
t5.setText("Invalid Location");
}
}
}