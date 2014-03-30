# noeq

A Clojure client for the noeqd flake id generator.

Based on the java client from https://github.com/noeq/java-noeq

## Usage

Create a client by connecting, with an auth token (leave empty if you have auth disabled)

```clojure
(def my-id-generator (new-id-generator "" "localhost:4444,localhost:4445"))
```

That returns a function. To get one id, call the fn with no args:

```clojure
(my-id-generator)
```

To get an array of ids, call it with the number of ids you'd like:

```clojure
(my-id-generator 5)
```

## License

Copyright © 2014 Tom Crayford

Distributed under the Eclipse Public License, the same as Clojure.
