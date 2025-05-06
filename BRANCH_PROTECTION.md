# Branch Protection Rules Setup

This document explains how to set up branch protection rules for this repository in GitHub.

## Main Branch Protection

To protect the `main` branch from direct pushes and ensure quality checks are met before merging:

1. Go to the repository's **Settings** tab
2. Click on **Branches** in the left sidebar
3. Under "Branch protection rules", click **Add rule**
4. For "Branch name pattern", enter `main`
5. Enable the following settings:
   - ✅ **Require pull request reviews before merging**
     - ✅ Require at least 1 approval
     - ✅ Dismiss stale pull request approvals when new commits are pushed
   - ✅ **Require status checks to pass before merging**
     - ✅ Require branches to be up to date before merging
     - Search for and enable the following status checks:
       - `build` (the GitHub Actions CI workflow)
   - ✅ **Require conversation resolution before merging**
   - ✅ **Do not allow bypassing the above settings**
6. Click **Create** to save the rule

## Develop Branch Protection

For the `develop` branch, apply similar but slightly less strict rules:

1. Add another branch protection rule
2. For "Branch name pattern", enter `develop`
3. Enable the following settings:
   - ✅ **Require pull request reviews before merging**
     - ✅ Require at least 1 approval
   - ✅ **Require status checks to pass before merging**
     - Search for and enable the GitHub Actions workflow
   - ✅ **Require conversation resolution before merging**
4. Click **Create** to save the rule

## Repository Settings

Additionally, configure these repository settings:

1. Go to the repository's **Settings** tab
2. Under **Options**:
   - Disable "Allow merge commits" and "Allow rebase merging" (optional)
   - Enable "Allow squash merging"
   - Enable "Automatically delete head branches" after pull requests are merged

This setup ensures:

- No direct pushes to `main` or `develop`
- All changes must pass CI checks before merging
- Code reviews are required for all changes
- Branch coverage and code style requirements are enforced
