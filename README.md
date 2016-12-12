<img src="/doc/lessner.png"/>

# lessner

An implementation of the judicial style of judge Lessner

## Usage

```(require '[hon.patrice.lessner :as hpl])```

```(let [x (+ 2 2)] (hpl/case x 4 1 3 2 in-my-opinion))```

```=> "4 1...in-your-opinion"```


```(let [x (+ 2 2)] (hpl/case x 4 1 in-my-opinion 3 2 in-my-opinion))```

```=> 1```

## License

Copyright © 2016 Matthew Chadwick

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
