<h1>Design_Patterns_Java</h1>
<p>
This repository contains educational implementations of key object-oriented design patterns in Java.
Each pattern is organized into its own package and includes:
</p>
<ul>
  <li><strong>Singleton Pattern</strong>: Demonstrates both thread-safe and unsafe variants;</li>
  <li><strong>Builder Pattern</strong>: Explores burger-building scenarios with abstraction and directors;</li>
  <li><strong>Abstract Factory Pattern</strong>: Uses client contracts to generate cars with shared interfaces;</li>
  <li><strong>Factory Method Pattern</strong>: Provides a car production model where each subclass defines its own product creation logic;</li>
  <li><strong>Facade Pattern</strong>: Simplifies subsystem interactions with an apartment registration example;</li>
  <li><strong>Observer Pattern</strong>: Implements event subscription using TV, Newspaper, and Journalist classes;</li>
  <li><strong>Template Method Pattern</strong>: Defines worker daily routines with concrete subclasses overriding specific behaviors;</li>
  <li><strong>Dependency Injection</strong>: Demonstrates Spring-based DI with services and notification senders;</li>
  <li><strong>Adapter Pattern</strong>: Adapts DropBox API to a common file handler interface for unified file operations.</li>
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
  <li><code>factorymethod</code>: Abstract creators define car factories, and concrete factories build specific models like Corolla, Jetta, and Model S;</li>
  <li><code>facade</code>: Apartment registration example with simplified interface to complex subsystems;</li>
  <li><code>observer</code>: Implements observer pattern with subjects and observers like TV, Newspaper, and Journalist;</li>
  <li><code>templatemethod</code>: Abstract worker routines with concrete worker types like Cop, Firefighter, and Manager;</li>
  <li><code>dependencyinjection</code>: Spring framework based DI examples with services and notification senders;</li>
  <li><code>adapter</code>: Adapter pattern example integrating DropBox with a generic file handler interface.</li>
</ul>
<h2>📅 Commit Highlights</h2>
<h3>June 1, 2025</h3>
<ul>
  <li>Added JavaDocs and comments to all files in the <code>dependencyinjection</code> package;</li>
  <li>Added detailed explanation of Dependency Injection concepts in the Demo file;</li>
  <li>Created <code>NotificationSender</code> and refined interfaces with prefixed 'I';</li>
  <li>Demonstrated Dependency Injection using Spring framework.</li>
</ul>
<h3>May 31, 2025</h3>
<ul>
  <li>Implemented Adapter pattern to integrate DropBox with a common file handling interface (<code>IHandleFiles</code>);</li>
  <li>Created <code>DropBoxAdapter</code> to adapt DropBox API for uniform file operations;</li>
  <li>Added mock classes <code>DropBox</code>, <code>DropBoxFile</code>, and <code>GoogleDrive</code> for demonstration;</li>
  <li>Included demo showcasing file recording and reading through the adapter interface.</li>
</ul>
<h3>May 30, 2025</h3>
<ul>
  <li>Created Facade pattern example with apartment registration system;</li>
  <li>Implemented interfaces and concrete classes to simplify subsystem interactions;</li>
  <li>Added demo to illustrate facade usage.</li>
</ul>
<h3>May 29, 2025</h3>
<ul>
  <li>Created Observer pattern example with <code>Observer</code> and <code>Subject</code> interfaces;</li>
  <li>Implemented observers like TV and Newspaper and subject Journalist to manage notifications;</li>
  <li>Added demo showing observer registration and notification flow.</li>
</ul>
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
