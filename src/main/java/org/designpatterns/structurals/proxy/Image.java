package org.designpatterns.structurals.proxy;

/*The Proxy design pattern is applicable when there is a need to control
access to an Object, as well as when there is a need for a sophisticated
reference to an Object. Common Situations where the proxy pattern is applicable
are:
Virtual Proxies: delaying the creation and initialization of expensive objects
until needed, where the objects are created on demand (For example creating the
RealSubject object only when the doSomething method is invoked).
Remote Proxies: providing a local representation for an object that is in
a different address space. A common example is Java RMI stub objects.
The stub object acts as a proxy where invoking methods on the stub would cause
the stub to communicate and invoke methods on a remote object (called skeleton)
found on a different machine.
Protection Proxies: where a proxy controls access to RealSubject methods,
by giving access to some objects while denying access to others.
Smart References: providing a sophisticated access to certain objects such
as tracking the number of references to an object and denying access if a
certain number is reached, as well as loading an object from database into
memory on demand.*/
/**
 * Subject Interface
 */
public interface Image {

    public void showImage();
}


