---
trigger: always_on
---

### critical - this is a pure build port, so we expect few-to-none functional changes

# use bazel test //... to validate that nothing has regressed
# you never need to run bazel clean
# the build can take time, so be patient - as long as bazel continaues to give output (such as times ticking up), things are still ok
# bazel will only allow one build at a time, so don't bother starting a seond
# we want granular build files at leaf directories, similar to legend-shared, rather than one at the root of each project
# we want small, functionally focussed build targets within those files, for performance
# we want individual tests per java test file