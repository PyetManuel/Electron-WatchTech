public class produits{

	int id ;
	int price ;
	int stock ;
	String title ;
	String reference ;
	String description ;
	String couleur ;
	String photo ;

	public String getid(){
		return id;
	}

		public String getprice(){
		return price;
	}

		public String getstock(){
		return stock;
	}

		public String gettitle(){
		return title;
	}

		public String getreference(){
		return reference;
	}

		public String getdescription(){
		return description;
	}

		public String getcouleur(){
		return couleur;
	}

		public String getphoto(){
		return photo;
	}



	public void setid(String identifiant ){
		this.id = identifiant
	}

	public void setprice(int prix ){
		this.price = prix
	}

	public void setstock(String stockage ){
		this.stock = stockage
	}

	public void settitle(String titre ){
		this.title = titre
	}

	public void setreference(String ref ){
		this.reference = ref
	}

	public void setdescription(String desc ){
		this.description = desc
	}

	public void setcouleur(String color ){
		this.couleur = color
	}

	public void setphoto(String image ){
		this.photo = image
	}
	
}

class montre extends produits{
	String genre ;
	String typeBracelet ;
	String matièreCadran ;
	String sytle ;

	public String getgenre(){
		return genre
	}

	public String gettypeBracelet(){
		return type typeBracelet;
	}

		public String getmatièreCadran(){
		return matièreCadran;
	}

		public String getstyle(){
		return sytle;
	}




		public void setgenre(String genremontre ){
		this.genre = genremontre
	}

	public void settypeBracelet(String bracelet ){
		this.typeBracelet = bracelet
	}

	public void setmatièreCadran(String cadran ){
		this.matièreCadran = cadran
	}

	public void setstyle(String lestyle ){
		this.style = lestyle
	}


	public void setmontre(String )

	public montre(String genre, String typeBracelet, String matièreCadran, String sytle){

	super(id, price, stock, title, reference, description, couleur, photo, genre, typeBracelet, matièreCadran, sytle)

	}

}