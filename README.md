<h1>Spring Web MVC (+ Hibernate, Spring Data JPA) hello world without any XML file using Spring Boot</h1>

<p>No web.xml, no Spring xml configuration file, no persistence.xml, 
no *.hbm.xml, simply no XML configuration file is in this example, 
which retrieves data from database and returns them in JSON format.</p>

<p>This project uses embedded HSQL database, which creates an in-memory database at startup and 
destroys all data at shutdown.</p>

<p>
	How to run:
	<code>mvn jetty:run</code>
</p>

<ul>
<li>List all customers (in JSON format): <code>http://localhost:8080/customers</code></li>
<li>Customer detail (in JSON format): <code>http://localhost:8080/customers/1</code></li>
</ul>

<p>
	How to build WAR file:
	<code>mvn package</code>
</p>
