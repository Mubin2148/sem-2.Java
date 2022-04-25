class book
{
	private String author_name;
	book(String author_name)
	{
		this.author_name=author_name;
	}
	void display()
	{
		System.out.println(author_name);
	}

}

class book_publication extends book
{
	private String title;
	book_publication(String title)
	{
		super("");
		this.title=title;
	}
	void display()
	{
		System.out.println(title);
	}
}

class paper_publication extends book
{
	private String title;
	paper_publication(String title)
	{
		super("");
		this.title=title;
	}
	void display()
	{
			System.out.print(title);
	}
}

class Lab6_2
{
	public static void main(String[] args) 
	{

		book b = new book("anokho_sayar");
		book b1 = new book_publication("KSR");
		book b2 = new paper_publication("kothariya state");

		b.display();
		b1.display();
		b2.display();
	}
}
