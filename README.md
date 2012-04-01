# clj-aws-s3

A Clojure library for accessing Amazon S3, based on the official AWS
Java SDK.

Although there are a few S3 clients for Clojure around, this library
aims to provide a more complete implementation, with metadata, streams
and protocols for uploading different types of data.

Currently the library supports functions to create and delete buckets,
and to list, get, and put objects and their metadata.

Simple ACL support is included allowing setting object ACL to a canned ACL such as private, public readable, or public read write.

## Install

Add the following dependency to your `project.clj` file:

    [eandrejko/clj-aws-s3 "0.2.3"]

## Example

```clojure
(require '[aws.sdk.s3 :as s3])

(def cred {:access-key "...", :secret-key "..."})

(s3/create-bucket cred "my-bucket")

(s3/put-object cred "my-bucket" "some-key" "some-value")

(s3/set-object-acl cred "my-bucket" "some-key" :public-read)

(println (slurp (:content (s3/get-object cred "my-bucket" "some-key"))))
```

## Extended Put Support

Objects can be assigned a canned ACL at creation type:

```clojure
(s3/put-object cred "my-bucket" "some-key" "some-value" :canned-acl :public-read)
```

The `content-type` can also be set at object creation time:

```clojure
(s3/put-object cred "my-bucket" "some-key" "some-value" :content-type "image/png")
```

These options can be combined and additional key value pairs are stored as meta-data on the object:

```clojure
(s3/put-object cred "my-bucket" "some-key" "some-value" 
               :content-type "image/png"
               :canned-acl :public-read
               "metadata-key" "metadata-value")
```


## Documentation

* [API docs](http://weavejester.github.com/clj-aws-s3/)

## License

Copyright (C) 2012 James Reeves, Erik Andrejko

Distributed under the Eclipse Public License, the same as Clojure.
