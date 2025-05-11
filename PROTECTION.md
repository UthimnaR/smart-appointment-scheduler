# Branch Protection Rules

The following protection rules have been applied to the `main` branch:

- All changes must go through a Pull Request.
- PRs require at least one review before being merged.
- PRs will be blocked if any status checks (tests) fail.
- Direct pushes to `main` are disabled.

These rules ensure that:
- Code is peer-reviewed before merging.
- Broken code does not enter the main branch.
- All features are verified through automated tests.
