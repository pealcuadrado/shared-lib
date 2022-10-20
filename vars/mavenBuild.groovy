def call(args) {
  sh "${tool 'mavenLocal'}/bin/mvn ${args}"
}
