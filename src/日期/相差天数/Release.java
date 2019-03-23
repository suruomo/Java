package 日期.相差天数;
/*
 * 
 * 主要函数实现
 */
public class Release {
	//判断闰年
 public boolean isLeapYear(int year) {
	 return ((year%4==0) || ((year%100!=0)&&year%400==0)); 
 }
 //获取每月天数
 public int getDays(Date date) {
	 int num;
	 switch(date.getMonth()) {
	 case 1:
	 case 3:
	 case 5:
	 case 7:
	 case 8:
	 case 10:
	 case 12:
	      num=31;
	       break;
	 case 2:
		 if(isLeapYear(date.getYear())) {
			 num=29;
		 }
		 else {
			 num=28;
		 }
		 break;
	default:
			num=30; 
	 }
	 return num;
 }
 //判断日期是否合法
 public boolean isVaild(Date date) {
	 if(date.getYear()<0||date.getMonth()<1||date.getMonth()>12)
		 return false;
	 if(date.getDay()<0||date.getDay()<getDays(date))
		 return false;
	 return true;
 }
 //天数+1
 public void addDay(Date date) {
	 date.setDay(date.getDay()+1);//天数加一
	 if(date.getDay()>getDays(date)) {  //如果大于该月最大天数
		 date.setDay(1);
		 date.setMonth(date.getMonth()+1);  //下一月
		 if(date.getMonth()>12) {
			 date.setMonth(1);
			 date.setYear(date.getYear()+1); //下一年
		 }
	 }
 }
 //比较两日期
 public int compare(Date date1,Date date2) {
	 if(date1.getYear()<date2.getYear())
		 return 1;
	 if(date1.getYear()<=date2.getYear()&&date1.getMonth()<date2.getMonth())
		 return 1;
	 if(date1.getYear()<=date2.getYear()&&date1.getMonth()<=date2.getMonth()&&date1.getDay()<date2.getDay())
		 return 1;
	 return 0;
 }
 //计算间隔天数
 public long dateDays(Date date1,Date date2) {
	 long delda=0;
	 Date date3;
	 //若date1>date2,交换
	 if(compare(date1,date2)==0) {
		 date3=date1;
		 date1=date2;
		 date2=date3;
	 }
	 while(compare(date1,date2)==1) {
		 addDay(date1);
		 delda++;
	 }
	 return delda;
 }
}
