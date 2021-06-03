
/* <script src="dexie.min.js"></script> inclure dans une page*/

/* Créer une base et défniit un schéma*/
var db = new Dexie("MyDB")

db.version(1).stores({
  mytable: 'name,data'
})

	
	/* ouvre la base de donnée */

	var err = document.getElementById("err")
	err.innerHTML = "Database open"

	db.open().catch(function(error) {
 	 err.innerHTML = "Can't open the database! Error:" + error
	})
	
/*Mettre des entrées */

function sayAdded() {
  document.getElementById("added").innerHTML += "Record added!"
}

db.mytable.put({name: "x86", data: "8 MB RAM, 256 GB SSD"}).then(sayAdded)
db.mytable.put({name: "ARM", data: "2 MB RAM, 32 GB EMMC"}).then(sayAdded)



/*Retrouver les données */
function showData(data) {
  document.getElementById("data").innerHTML += data[0].data
}

async function getData() {
  var result = await db.mytable.where('name').equals('ARM').toArray()
  showData(result)
}
getData()

/* commande qui protège les données en cas de suppression de google */
navigator.storage.persist()