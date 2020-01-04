# Package Management Systems

## What is a Package Management System?

The core parts of a Linux distribution and most of its add-on software are installed through the Package Management System. Each package contains files to make one component work well with other components comprimising the entire system, and may depend on other packages to function.

## Package Management: Two-Levels

There are usually two Package Management Systems installed on an OS. The 'low-level' system takes care of unpacking single packages, running scripts, and installing software correctly. On the other hand, the 'high-level' system works with groups of packages, downloads packages from the vendor, and figures out dependencies. 

* **Low-Level Systems:** dpkg (Debian Package), rpm (Red-Hat Package Manager)

* **High-Level Systems:** apt-get (Advanced Packaging Tool), yum (Yellowdog Updater Modified), zypper

## Commands

| Operation                     | RPM /yum        | deb                     |
| ----------------------------- | --------------- | ----------------------- |
| Install package               | rpm -i foo.rpm  | dpkg --install foo.deb  |
| Install package, dependencies | yum install foo | apt-get install foo     |
| Remove package                | rpm -e foo.rpm  | dpkg --remove foo.deb   |
| Remove package, dependencies  | yum remove foo  | apt-get autoremove foo  |
| Update package                | rpm -U foo.rpm  | dpkg --install foo.deb  |
| Update package, dependencies  | yum update foo  | apt-get install foo     |
| Update entire system          | yum update      | apt-get dist-upgrade    |
| Show all installed packages   | rpm -qa or yum list installed | dpkg --list |
| Get information on package    | rpm -qil foo    | dpkg --listfiles foo    |
| Show packages named foo       | yum list "foo"  | apt-cache search foo    |
| Show all available packages   | yum list        | apt-cache dumpavail foo |
| What package is file part of? | rpm -qf file    | dpkg --search file      |
