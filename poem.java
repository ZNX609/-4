package experiment3;

public class Poem {

	public static void main(String[] args) {
			//�����ַ���
			String chg = " ������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ�����" + "����һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ"
					  + "���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ" + "�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���������������Ż�"
					  + "�������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ���������"+ "����ܱ�Ķ����������������������س����̳���ǧ�����������д仪ҡҡ�и�ֹ�������Ű�����"
					  + "�����������κ���ת��ü��ǰ������ί�������մ��̽�ȸ��ɦͷ��������Ȳ��ûؿ�Ѫ������� ";
			char[] chars =chg.toCharArray();//��������
			StringBuffer sg = new StringBuffer();//׷�����ݵ���ǰStringBuffer�����ĩβ
			
			//�����ַ����йؼ��ֳ��ֵĴ���
//			countString(chg,"��");
			int i;
			
			for (i =1; i <chg.length(); i++) {
				//�ڱ�ѡԪ�صĽ�β�������
				sg.append(chars[i]);
			
				if (i%7==0&&i%2==1||i%14==0&&i%2==0) {
					//i%7����0����iΪ����ʱ���ڽ�β�ӣ�
					if(i%7==0&&i%2==1)
				sg.append(",");
					
					
					//i%14����0����iΪż��ʱ���ڽ�β�ӡ�
					else
						sg.append("��\n");
				}
				
				}
			System.out.println("���޸�");
			System.out.println(sg.toString());
			System.out.println("......");
	}}
				
			
//		}

	
	
	
//		private static void countString(String chg, String string) {
//			// TODO Auto-generated method stub
//			int count=0;
//			while(chg.indexOf(string)!=-1){//�����ִ���ָ���ַ��״γ��ֵ�λ��
//				//public String substring(int beginIndex, int endIndex)
//				//����һ�����ַ��������Ǵ��ַ�����һ�����ַ�����
//				//�����ַ�����ָ���� beginIndex ����ʼ�� endIndex:��ָ���� endIndex-1��������
//				chg = chg.substring(chg.indexOf(string)+1,chg.length());    
//	            count++;
//			}
//			System.out.println(string+"���ֵĴ���Ϊ:"+count+"��");
//		}
//
//			
//		}




