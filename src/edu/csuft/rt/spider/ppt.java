package edu.csuft.rt.spider;




import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author wtao
 *
 */
public class ppt {

	// alt + /
	// ctrl + s 
	//ctrl + shift + o
	public static  void main(String[] args) {
		//线程池
		//固定大小
		ExecutorService pool=Executors.newFixedThreadPool(8);
				
		//无限缓存
				pool=Executors.newCachedThreadPool();
		//单线程
		//pool=Executors.newSingleThreadExecutor();
				
				for(int i =1;i<=100;i++)
				{
					pool.submit(new Task(i));
				
				}
		

		// 
		/*String url = "https://movie.douban.com/top250";

		// 。
		try {
			Document doc = Jsoup.connect(url).get();

			Elements es = doc.select(".grid_view .item");
			System.out.println(es.size());

			// 创建一个影片列表
			ArrayList<Film> list = new ArrayList<>();

			for (Element e : es) {
				Film f = new Film(); */
				// 每一部电影
//	 		    Element t = e.select(".title").first();
//				String num = e.select(".star span").last().text();
//				System.out.println(t.text() + ", " + num);

  			   /* f.id = Integer.parseInt(e.select(".pic em").first().text());
				f.poster = e.select("img").first().attr("src");
				f.info =e.select(".bd p").first().text();
  			    f.title = e.select(".title").first().text();
  			    f.rating = Double.parseDouble(e.select(".rating_num").first().text());
  			    String num = e.select(".star span").last().text();
  			    f.num = Integer.parseInt(num.substring(0,num.length() - 3));
  			    f.quote = e.select(".inq").first().text();
  			    System.out.println(f);
				list.add(f);
			}*/

//			String title = doc.title();
//			String data = doc.data(); 

//			System.out.println(title);
//			System.out.println(data);

		/*} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}
}

