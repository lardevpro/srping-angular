package com.example.backend;

import org.springframework.web.bind.annotation.*;

import java.util.List;


/* en los endpoint deberían ir consultas a la bas de datos pero en
caso no hay base de datos puesto que lo que se quiere mostrar solamente la comunicación */
@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Book> findAll() {
        System.out.println("findAll");
        return List.of(
                new Book(1L,"1984","Una distopía que explora un mundo totalitario bajo constante vigilancia.","Una novela distópica que presenta un mundo totalitario gobernado por el omnipresente Gran Hermano. La historia sigue a Winston Smith, un empleado del Ministerio de la Verdad, mientras lucha contra la opresión del régimen que controla cada aspecto de la vida, desde los pensamientos hasta las emociones. ,1984 es una advertencia atemporal sobre los peligros de la vigilancia masiva, la manipulación del lenguaje y la tiranía política.","George Orwell","https://imagessl2.casadellibro.com/a/l/s7/72/9788414342572.webp"),
                new Book(2L,"El Señor de los Anillos: La Comunidad del Anillo","La primera parte de la épica historia de la Tierra Media y el viaje del Anillo Único.","En esta primera parte de la legendaria saga, Frodo Bolsón recibe el Anillo Único, un objeto de poder inmenso creado por Sauron, el Señor Oscuro. Frodo, junto con una diversa compañía de elfos, enanos, hombres y hobbits, emprende un peligroso viaje para destruir el anillo en los fuegos del Monte del Destino. La obra combina aventura, mitología y un profundo análisis de la lucha entre el bien y el mal.","J.R.R. Tolkien","https://imagessl7.casadellibro.com/a/l/s7/57/9788445013557.webp"),
                new Book(3L,"Cien Años de Soledad"," Una obra maestra del realismo mágico que narra la historia de la familia Buendía en Macondo."," Una de las obras más representativas del realismo mágico, narra la historia de la familia Buendía a lo largo de siete generaciones en el mítico pueblo de Macondo. La novela entrelaza lo mágico y lo real, explorando temas como el amor, la soledad, la memoria y el destino. Es una reflexión profunda sobre la condición humana y la historia de América Latina.","Gabriel García Márquez","https://imagessl8.casadellibro.com/a/l/s7/58/9788439745358.webp"),
                new Book(4L,"El Principito","Un clásico que trata sobre la inocencia, la amistad y el amor."," Un aviador varado en el desierto del Sahara conoce a un pequeño príncipe de otro planeta. A través de sus conversaciones, el príncipe relata sus viajes por varios asteroides y los encuentros con personajes peculiares que simbolizan aspectos de la sociedad y la condición humana. Este cuento filosófico y poético explora temas como la amistad, el amor, la pérdida y la búsqueda de significado.","Antoine de Saint-Exupéry","https://imagessl6.casadellibro.com/a/l/s7/96/9788478886296.webp"),
                new Book(5L,"Orgullo y Prejuicio","Una historia romántica sobre el orgullo, los prejuicios y la evolución personal.","Esta novela clásica sigue la vida de Elizabeth Bennet, una joven inteligente y perspicaz, mientras navega por las complejidades del amor, la familia y las expectativas sociales en la Inglaterra rural del siglo XIX. La relación de Elizabeth con el orgulloso pero reservado Sr. Darcy evoluciona de forma fascinante, ofreciendo una crítica mordaz a las normas de clase y género de la época.","Jane Austen","https://imagessl1.casadellibro.com/a/l/s7/81/9788414342381.webp"),
                new Book(6L,"Harry Potter y la Piedra Filosofal","El inicio de la mágica aventura de Harry Potter en el mundo de los magos."," La primera entrega de la famosa serie de Harry Potter presenta al joven huérfano que descubre que es un mago. Al asistir al Colegio Hogwarts de Magia y Hechicería, Harry se hace amigo de Ron y Hermione y aprende sobre sus propios poderes y su conexión con el oscuro mago Lord Voldemort. Es una historia mágica que combina amistad, valentía y el poder del amor.","J.K. Rowling","https://imagessl7.casadellibro.com/a/l/s7/57/9788478884957.webp"),
                new Book(7L,"El Alquimista","Una fábula sobre seguir los sueños y encontrar el propósito de la vida.","Santiago, un joven pastor andaluz, emprende un viaje para encontrar un tesoro escondido en las pirámides de Egipto. A lo largo del camino, aprende importantes lecciones sobre la vida, el amor y el propósito, encontrando la verdadera riqueza en el autoconocimiento y la realización personal. Una obra inspiradora sobre seguir los sueños y escuchar el lenguaje del universo.","Paulo Coelho","https://imagessl5.casadellibro.com/a/l/s7/55/9788408144755.webp"),
                new Book(8L,"Matar a un Ruiseñor","Una fábula sobre seguir los sueños y encontrar el propósito de la vida.","Ambientada en el sur de los Estados Unidos durante la Gran Depresión, la novela sigue a Scout Finch, una niña que observa los prejuicios raciales y la injusticia social mientras su padre, Atticus Finch, defiende a un hombre negro acusado injustamente de violación. Una obra conmovedora que explora la moralidad, la empatía y la lucha por la justicia.","Harper Lee","https://imagessl1.casadellibro.com/a/l/s7/81/9788418623981.webp"),
                new Book(9L,"Don Quijote de la Mancha","La obra cumbre de la literatura española que sigue las aventuras de un caballero idealista y su fiel escudero.","Considerada la primera novela moderna, esta obra sigue las aventuras del caballero Don Quijote y su fiel escudero Sancho Panza. Mientras Don Quijote intenta revivir la caballerosidad en un mundo que se ha vuelto cínico, la novela mezcla humor, tragedia y reflexión filosófica, abordando temas como la realidad, la locura y el idealismo.","Miguel de Cervantes","https://imagessl5.casadellibro.com/a/l/s7/45/9788413379845.webp")
        );
    }
//    @GetMapping("/{id}")
//    public Book findById(@PathVariable Long id) {
//        System.out.println("findById" +id);
//        return new Book(4L,"book" +id);
//    }
}
