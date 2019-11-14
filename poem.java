package experiment3;

public class Poem {

	public static void main(String[] args) {
			//定义字符串
			String chg = " 汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧" + "回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时"
					  + "云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜" + "后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列土可怜光彩生门户"
					  + "遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足"+ "渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行翠华摇摇行复止西出都门百余里"
					  + "六军不发无奈何宛转蛾眉马前死花钿委地无人收翠翘金雀玉搔头君王掩面救不得回看血泪相和流 ";
			char[] chars =chg.toCharArray();//定义数组
			StringBuffer sg = new StringBuffer();//追加内容到当前StringBuffer对象的末尾
			
			//计算字符串中关键字出现的次数
//			countString(chg,"长");
			int i;
			
			for (i =1; i <chg.length(); i++) {
				//在被选元素的结尾插入符号
				sg.append(chars[i]);
			
				if (i%7==0&&i%2==1||i%14==0&&i%2==0) {
					//i%7等于0并且i为奇数时，在结尾加，
					if(i%7==0&&i%2==1)
				sg.append(",");
					
					
					//i%14等于0并且i为偶数时，在结尾加。
					else
						sg.append("。\n");
				}
				
				}
			System.out.println("长恨歌");
			System.out.println(sg.toString());
			System.out.println("......");
	}}
				
			
//		}

	
	
	
//		private static void countString(String chg, String string) {
//			// TODO Auto-generated method stub
//			int count=0;
//			while(chg.indexOf(string)!=-1){//查找字串中指定字符首次出现的位置
//				//public String substring(int beginIndex, int endIndex)
//				//返回一个新字符串，它是此字符串的一个子字符串。
//				//该子字符串从指定的 beginIndex 处开始， endIndex:到指定的 endIndex-1处结束。
//				chg = chg.substring(chg.indexOf(string)+1,chg.length());    
//	            count++;
//			}
//			System.out.println(string+"出现的次数为:"+count+"次");
//		}
//
//			
//		}




