properties([
    [$class: 'RebuildSettings', autoRebuild: false, rebuildDisabled: false], 
    parameters([
        booleanParam(defaultValue: false, description: 'Please select to apply all changes to environment', name: 'applyChanges'), 
        booleanParam(defaultValue: false, description: 'Please select to destroy all changes to environment', name: 'destroyChanges'), 
        string(defaultValue: '', description: 'Please provide the docker image to deploy', name: 'selectedDockerImage', trim: true), 
        choice(choices: ['dev', 'qa', 'stage', 'prod'], description: 'Please select the environment to deploy', name: 'enviroment')
        ])
        ])

println(
    """
    Apply changes: ${params.applyChanges}
    Destroy changes: ${params.destroyChanges}
    Docker  image:  ${params.selectedDockerImage}
    Environment: ${params.environment}
    """
)