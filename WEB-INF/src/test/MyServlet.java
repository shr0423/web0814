/*
�� Ŭ������ ���� ���������� �ؼ� �� ����Ǿ����� Ŭ�����̴�.
�̷��� Ŭ������ ������ ����(Servlet)�̶��Ѵ�.
*/
package test;

//���� Ŭ������ ��ӹ����� �̶����� MyServlet ��
//������ �ȴ�..is a ����
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

//�� ������ �̿��Ͽ� ���� �̸��� ���������� ����غ���
public class MyServlet extends HttpServlet{
	
	//Ŭ���̾�Ʈ�� ��û�� get����� ���, doGet() �޼���� ��û�� �޾ƾ��Ѵ�.
	//jsp������ request���尴ü�� �ڷ����� ���HttpServletRequest�� �̾���.
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			//���� �̸��� ���������� �����Ͽ� ���������� ��������
			response.setContentType("text/html;charset=utf-8");//jsp������ page���ÿ����� ���ڵ�
			PrintWriter out=response.getWriter();

			out.print("my name is ������");
	}
}
