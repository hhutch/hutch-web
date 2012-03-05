# hutch-web

A Leiningen template for creating a Noir project with a complete toolchain including:
* [enlive][enlive]
* [enfocus][enfocus]
* [jayq][jayq]
* [fetch](https://github.com/ibdknox/fetch)
* [lein-cljsbuild][lein-cljsbuild]
* [marginalia][marginalia]
* [html5 boilerplate](http://html5boilerplate.com/)

## Usage

Install the plugin with [lein][lein]:

```bash
lein plugin install lein-newnew 0.1.2
git clone [hutch-web][hutch-web]
cd hutch-web
lein install
lein plugin install hutch-web 0.1.0-SNAPSHOT
```

To create a new project,

```bash
lein new hutch-web my-project

## License

Copyright © 2012 Hunter Hutchinson

Distributed under the Eclipse Public License, the same as Clojure.
