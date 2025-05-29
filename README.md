<h1>Design_Patterns_Java</h1>
<p>
This repository contains educational implementations of key object-oriented design patterns in Java.
Each pattern is organized into its own package and includes:
</p>
<ul>
  <li><strong>Singleton Pattern</strong>: Demonstrates both thread-safe and unsafe variants;</li>
  <li><strong>Builder Pattern</strong>: Explores burger-building scenarios with abstraction and directors;</li>
  <li><strong>Abstract Factory Pattern</strong>: Uses client contracts to generate cars with shared interfaces;</li>
  <li><strong>Factory Method Pattern</strong>: Provides a car production model where each subclass defines its own product creation logic.</li>
</ul>
<p>
The repository is structured for both learning and practical reference. 
JavaDocs and inline comments have been added for all files to improve clarity and support self-study.
</p>
  <h2>📂 Structure</h2>
<ul>
  <li><code>singleton</code>: Lazy initialization, thread-safe variations, and property-based Singleton examples;</li>
  <li><code>builder</code>: Abstract builders, concrete implementations, and a manager class as a director;</li>
  <li><code>abstractfactory</code>: Factory hierarchies for cars and clients with/without contracts;</li>
  <li><code>factorymethod</code>: Abstract creators define car factories, and concrete factories build specific models like Corolla, Jetta, and Model S.</li>
</ul>
  <h2>📅 Commit Highlights</h2>
<h3>May 29, 2025</h3>
<ul>
  <li>Renamed <code>factory</code> package to <code>abstractfactory</code> for clarity;</li>
  <li>Created new <code>factorymethod</code> package to demonstrate the Factory Method pattern;</li>
  <li>Implemented <code>Car</code> abstract product with basic behaviors like <code>startEngine</code> and <code>fuelCar</code>;</li>
  <li>Created factories for specific cars: <code>CorollaCarFactory</code>, <code>JettaCarFactory</code>, and <code>ModelSCarFactory</code>;</li>
  <li>Enhanced JavaDocs to better explain the Factory Method concept and demo flow.</li>
</ul>
<h3>May 27, 2025</h3>
<ul>
  <li>Added JavaDocs to all classes and methods;</li>
  <li>Implemented client-type factories with matching car variations;</li>
  <li>Enhanced demo logic with dynamic class-based print output.</li>
</ul>
<h3>May 26, 2025</h3>
<ul>
  <li>Completed Builder pattern with burgers, manager, and variation builders;</li>
  <li>Reorganized files and added supporting comments.</li>
</ul>
<h3>May 25, 2025</h3>
<ul>
  <li>Added thread-safe and unsafe Singleton demos with detailed documentation;</li>
  <li>Wrote JavaDocs and inline comments to explain multithreading issues.</li>
</ul>
<h3>May 24, 2025</h3>
<ul>
  <li>Implemented classic Singleton pattern with lazy initialization;</li>
  <li>Added property-based Singleton variant for enhanced control.</li>
</ul>
