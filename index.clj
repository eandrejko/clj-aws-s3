{:namespaces
 ({:source-url nil,
   :wiki-url "aws.sdk.s3-api.html",
   :name "aws.sdk.s3",
   :doc
   "Functions to access the Amazon S3 storage service.\n\nEach function takes a map of credentials as its first argument. The\ncredentials map should contain an :access-key key and a :secret-key key."}),
 :vars
 ({:file "src/aws/sdk/s3.clj",
   :raw-source-url nil,
   :source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/Mappable",
   :namespace "aws.sdk.s3",
   :line 142,
   :var-type "var",
   :doc "Convert a value into a Clojure map.",
   :name "Mappable"}
  {:file "src/aws/sdk/s3.clj",
   :raw-source-url nil,
   :source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/ToPutRequest",
   :namespace "aws.sdk.s3",
   :line 44,
   :var-type "var",
   :doc
   "A protocol for constructing a map that represents an S3 put request.",
   :name "ToPutRequest"}
  {:arglists ([cred name]),
   :name "bucket-exists?",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/bucket-exists?",
   :doc
   "Returns true if the supplied bucket name already exists in S3.",
   :var-type "function",
   :line 29,
   :file "src/aws/sdk/s3.clj"}
  {:arglists
   ([cred bucket src-key dest-key]
    [cred src-bucket src-key dest-bucket dest-key]),
   :name "copy-object",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/copy-object",
   :doc "Copy an existing S3 object to another key.",
   :var-type "function",
   :line 256,
   :file "src/aws/sdk/s3.clj"}
  {:arglists ([cred name]),
   :name "create-bucket",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/create-bucket",
   :doc "Create a new S3 bucket with the supplied name.",
   :var-type "function",
   :line 34,
   :file "src/aws/sdk/s3.clj"}
  {:arglists ([cred name]),
   :name "delete-bucket",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/delete-bucket",
   :doc "Delete the S3 bucket with the supplied name.",
   :var-type "function",
   :line 39,
   :file "src/aws/sdk/s3.clj"}
  {:arglists ([cred bucket key]),
   :name "delete-object",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/delete-object",
   :doc "Delete an object from an S3 bucket.",
   :var-type "function",
   :line 240,
   :file "src/aws/sdk/s3.clj"}
  {:arglists ([cred bucket key]),
   :name "get-object",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/get-object",
   :doc
   "Get an object from an S3 bucket. The object is returned as a map with the\nfollowing keys:\n  :content  - an InputStream to the content\n  :metadata - a map of the object's metadata\n  :bucket   - the name of the bucket\n  :key      - the object's key",
   :var-type "function",
   :line 182,
   :file "src/aws/sdk/s3.clj"}
  {:arglists ([cred bucket key]),
   :name "get-object-acl",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/get-object-acl",
   :doc "Returns object ACL (AccessControlList)",
   :var-type "function",
   :line 263,
   :file "src/aws/sdk/s3.clj"}
  {:arglists ([cred bucket key]),
   :name "get-object-metadata",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/get-object-metadata",
   :doc
   "Get an object's metadata from a bucket. The metadata is a map with the\nfollowing keys:\n  :cache-control          - the CacheControl HTTP header\n  :content-disposition    - the ContentDisposition HTTP header\n  :content-encoding       - the character encoding of the content\n  :content-length         - the length of the content in bytes\n  :content-md5            - the MD5 hash of the content\n  :content-type           - the mime-type of the content\n  :etag                   - the HTTP ETag header\n  :last-modified          - the last modified date\n  :server-side-encryption - the server-side encryption algorithm",
   :var-type "function",
   :line 192,
   :file "src/aws/sdk/s3.clj"}
  {:arglists ([cred bucket & [options]]),
   :name "list-objects",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/list-objects",
   :doc
   "List the objects in an S3 bucket. A optional map of options may be supplied.\nAvailable options are:\n  :delimiter - read only keys up to the next delimiter (such as a '/')\n  :marker    - read objects after this key\n  :max-keys  - read only this many objects\n  :prefix    - read only objects with this prefix\n\nThe object listing will be returned as a map containing the following keys:\n  :bucket          - the name of the bucket\n  :prefix          - the supplied prefix (or nil if none supplied)\n  :objects         - a list of objects\n  :common-prefixes - the common prefixes of keys omitted by the delimiter\n  :max-keys        - the maximum number of objects to be returned\n  :truncated?      - true if the list of objects was truncated\n  :marker          - the marker of the listing\n  :next-marker     - the next marker of the listing",
   :var-type "function",
   :line 217,
   :file "src/aws/sdk/s3.clj"}
  {:arglists ([cred bucket key]),
   :name "object-exists?",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/object-exists?",
   :doc
   "Returns true if an object exists in the supplied bucket and key.",
   :var-type "function",
   :line 245,
   :file "src/aws/sdk/s3.clj"}
  {:arglists ([cred bucket key value & options]),
   :name "put-object",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/put-object",
   :doc
   "Put a value into an S3 bucket at the specified key. The value can be\na String, InputStream or File (or anything that implements the ToPutRequest\nprotocol).\noptions is a list of key value pairs for setting ACL or object meta data:\n\nAcl options:\n:canned-acl - :public-read-write, :public-read, :private [default]\n\nMeta data options:\n:cache-control - cache control HTTP header\n:content-disposition - content disposition HTTP header\n:content-type - content type HTTP header\n\nadditional key value pairs are set as user meta data on the object\n\n(s3/put-object cred \"my-bucket\" \"some-key\" \"some-value\"\n             :content-type \"image/png\"\n             :canned-acl :public-read\n             \"metadata-key\" \"metadata-value\")",
   :var-type "function",
   :line 114,
   :file "src/aws/sdk/s3.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/put-request",
   :namespace "aws.sdk.s3",
   :var-type "function",
   :arglists ([x]),
   :doc "Convert a value into a put request.",
   :name "put-request"}
  {:arglists ([cred bucket key canned-acl]),
   :name "set-object-acl",
   :namespace "aws.sdk.s3",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/set-object-acl",
   :doc
   "Sets object ACL to one of CannedAccessControlList where canned-acl is one of:\n\n- :private\n- :public-read\n- :public-read-write\n\nsee: http://docs.amazonwebservices.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/s3/model/CannedAccessControlList.html",
   :var-type "function",
   :line 274,
   :file "src/aws/sdk/s3.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url "/aws.sdk.s3-api.html#aws.sdk.s3/to-map",
   :namespace "aws.sdk.s3",
   :var-type "function",
   :arglists ([x]),
   :doc "Return a map of the value.",
   :name "to-map"})}
