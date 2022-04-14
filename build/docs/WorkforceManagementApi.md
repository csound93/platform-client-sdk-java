---
title: WorkforceManagementApi
---

## WorkforceManagementApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                                                                                   | Description                                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [**deleteWorkforcemanagementBusinessunit**](WorkforceManagementApi.md#deleteWorkforcemanagementBusinessunit)                                                                             | Delete business unit                                                                                                                                     |
| [**deleteWorkforcemanagementBusinessunitActivitycode**](WorkforceManagementApi.md#deleteWorkforcemanagementBusinessunitActivitycode)                                                     | Deletes an activity code                                                                                                                                 |
| [**deleteWorkforcemanagementBusinessunitPlanninggroup**](WorkforceManagementApi.md#deleteWorkforcemanagementBusinessunitPlanninggroup)                                                   | Deletes the planning group                                                                                                                               |
| [**deleteWorkforcemanagementBusinessunitSchedulingRun**](WorkforceManagementApi.md#deleteWorkforcemanagementBusinessunitSchedulingRun)                                                   | Cancel a scheduling run                                                                                                                                  |
| [**deleteWorkforcemanagementBusinessunitServicegoaltemplate**](WorkforceManagementApi.md#deleteWorkforcemanagementBusinessunitServicegoaltemplate)                                       | Delete a service goal template                                                                                                                           |
| [**deleteWorkforcemanagementBusinessunitWeekSchedule**](WorkforceManagementApi.md#deleteWorkforcemanagementBusinessunitWeekSchedule)                                                     | Delete a schedule                                                                                                                                        |
| [**deleteWorkforcemanagementBusinessunitWeekShorttermforecast**](WorkforceManagementApi.md#deleteWorkforcemanagementBusinessunitWeekShorttermforecast)                                   | Delete a short term forecast                                                                                                                             |
| [**deleteWorkforcemanagementCalendarUrlIcs**](WorkforceManagementApi.md#deleteWorkforcemanagementCalendarUrlIcs)                                                                         | Disable generated calendar link for the current user                                                                                                     |
| [**deleteWorkforcemanagementManagementunit**](WorkforceManagementApi.md#deleteWorkforcemanagementManagementunit)                                                                         | Delete management unit                                                                                                                                   |
| [**deleteWorkforcemanagementManagementunitTimeofflimit**](WorkforceManagementApi.md#deleteWorkforcemanagementManagementunitTimeofflimit)                                                 | Deletes a time off limit object                                                                                                                          |
| [**deleteWorkforcemanagementManagementunitTimeoffplan**](WorkforceManagementApi.md#deleteWorkforcemanagementManagementunitTimeoffplan)                                                   | Deletes a time off plan                                                                                                                                  |
| [**deleteWorkforcemanagementManagementunitWorkplan**](WorkforceManagementApi.md#deleteWorkforcemanagementManagementunitWorkplan)                                                         | Delete a work plan                                                                                                                                       |
| [**deleteWorkforcemanagementManagementunitWorkplanrotation**](WorkforceManagementApi.md#deleteWorkforcemanagementManagementunitWorkplanrotation)                                         | Delete a work plan rotation                                                                                                                              |
| [**getWorkforcemanagementAdherence**](WorkforceManagementApi.md#getWorkforcemanagementAdherence)                                                                                         | Get a list of UserScheduleAdherence records for the requested users                                                                                      |
| [**getWorkforcemanagementAdhocmodelingjob**](WorkforceManagementApi.md#getWorkforcemanagementAdhocmodelingjob)                                                                           | Get status of the modeling job                                                                                                                           |
| [**getWorkforcemanagementAgentManagementunit**](WorkforceManagementApi.md#getWorkforcemanagementAgentManagementunit)                                                                     | Get the management unit to which the agent belongs                                                                                                       |
| [**getWorkforcemanagementAgentsMeManagementunit**](WorkforceManagementApi.md#getWorkforcemanagementAgentsMeManagementunit)                                                               | Get the management unit to which the currently logged in agent belongs                                                                                   |
| [**getWorkforcemanagementBusinessunit**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunit)                                                                                   | Get business unit                                                                                                                                        |
| [**getWorkforcemanagementBusinessunitActivitycode**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitActivitycode)                                                           | Get an activity code                                                                                                                                     |
| [**getWorkforcemanagementBusinessunitActivitycodes**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitActivitycodes)                                                         | Get activity codes                                                                                                                                       |
| [**getWorkforcemanagementBusinessunitIntradayPlanninggroups**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitIntradayPlanninggroups)                                       | Get intraday planning groups for the given date                                                                                                          |
| [**getWorkforcemanagementBusinessunitManagementunits**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitManagementunits)                                                     | Get all authorized management units in the business unit                                                                                                 |
| [**getWorkforcemanagementBusinessunitPlanninggroup**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitPlanninggroup)                                                         | Get a planning group                                                                                                                                     |
| [**getWorkforcemanagementBusinessunitPlanninggroups**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitPlanninggroups)                                                       | Gets list of planning groups                                                                                                                             |
| [**getWorkforcemanagementBusinessunitSchedulingRun**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitSchedulingRun)                                                         | Get a scheduling run                                                                                                                                     |
| [**getWorkforcemanagementBusinessunitSchedulingRunResult**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitSchedulingRunResult)                                             | Get the result of a rescheduling operation                                                                                                               |
| [**getWorkforcemanagementBusinessunitSchedulingRuns**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitSchedulingRuns)                                                       | Get the list of scheduling runs                                                                                                                          |
| [**getWorkforcemanagementBusinessunitServicegoaltemplate**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitServicegoaltemplate)                                             | Get a service goal template                                                                                                                              |
| [**getWorkforcemanagementBusinessunitServicegoaltemplates**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitServicegoaltemplates)                                           | Gets list of service goal templates                                                                                                                      |
| [**getWorkforcemanagementBusinessunitWeekSchedule**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekSchedule)                                                           | Get the metadata for the schedule, describing which management units and agents are in the scheduleSchedule data can then be loaded with the query route |
| [**getWorkforcemanagementBusinessunitWeekScheduleGenerationresults**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekScheduleGenerationresults)                         | Get the generation results for a generated schedule                                                                                                      |
| [**getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast)                         | Get the headcount forecast by planning group for the schedule                                                                                            |
| [**getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent)                                   | Loads agent&#39;s schedule history.                                                                                                                      |
| [**getWorkforcemanagementBusinessunitWeekSchedules**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekSchedules)                                                         | Get the list of week schedules for the specified week                                                                                                    |
| [**getWorkforcemanagementBusinessunitWeekShorttermforecast**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekShorttermforecast)                                         | Get a short term forecast                                                                                                                                |
| [**getWorkforcemanagementBusinessunitWeekShorttermforecastData**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekShorttermforecastData)                                 | Get the result of a short term forecast calculation                                                                                                      |
| [**getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults)       | Gets the forecast generation results                                                                                                                     |
| [**getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata) | Get the result of a long term forecast calculation                                                                                                       |
| [**getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups)             | Gets the forecast planning group snapshot                                                                                                                |
| [**getWorkforcemanagementBusinessunitWeekShorttermforecasts**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitWeekShorttermforecasts)                                       | Get short term forecasts                                                                                                                                 |
| [**getWorkforcemanagementBusinessunits**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunits)                                                                                 | Get business units                                                                                                                                       |
| [**getWorkforcemanagementBusinessunitsDivisionviews**](WorkforceManagementApi.md#getWorkforcemanagementBusinessunitsDivisionviews)                                                       | Get business units across divisions                                                                                                                      |
| [**getWorkforcemanagementCalendarDataIcs**](WorkforceManagementApi.md#getWorkforcemanagementCalendarDataIcs)                                                                             | Get ics formatted calendar based on shareable link                                                                                                       |
| [**getWorkforcemanagementCalendarUrlIcs**](WorkforceManagementApi.md#getWorkforcemanagementCalendarUrlIcs)                                                                               | Get existing calendar link for the current user                                                                                                          |
| [**getWorkforcemanagementHistoricaldataDeletejob**](WorkforceManagementApi.md#getWorkforcemanagementHistoricaldataDeletejob)                                                             | Retrieves delete job status for historical data imports of the organization                                                                              |
| [**getWorkforcemanagementHistoricaldataImportstatus**](WorkforceManagementApi.md#getWorkforcemanagementHistoricaldataImportstatus)                                                       | Retrieves status of the historical data imports of the organization                                                                                      |
| [**getWorkforcemanagementManagementunit**](WorkforceManagementApi.md#getWorkforcemanagementManagementunit)                                                                               | Get management unit                                                                                                                                      |
| [**getWorkforcemanagementManagementunitActivitycodes**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitActivitycodes)                                                     | Get activity codes                                                                                                                                       |
| [**getWorkforcemanagementManagementunitAdherence**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitAdherence)                                                             | Get a list of user schedule adherence records for the requested management unit                                                                          |
| [**getWorkforcemanagementManagementunitAgent**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitAgent)                                                                     | Get data for agent in the management unit                                                                                                                |
| [**getWorkforcemanagementManagementunitAgentShifttrades**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitAgentShifttrades)                                               | Gets all the shift trades for a given agent                                                                                                              |
| [**getWorkforcemanagementManagementunitShifttradesMatched**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitShifttradesMatched)                                           | Gets a summary of all shift trades in the matched state                                                                                                  |
| [**getWorkforcemanagementManagementunitShifttradesUsers**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitShifttradesUsers)                                               | Gets list of users available for whom you can send direct shift trade requests                                                                           |
| [**getWorkforcemanagementManagementunitTimeofflimit**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitTimeofflimit)                                                       | Gets a time off limit object                                                                                                                             |
| [**getWorkforcemanagementManagementunitTimeofflimits**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitTimeofflimits)                                                     | Gets a list of time off limit objects under management unit.                                                                                             |
| [**getWorkforcemanagementManagementunitTimeoffplan**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitTimeoffplan)                                                         | Gets a time off plan                                                                                                                                     |
| [**getWorkforcemanagementManagementunitTimeoffplans**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitTimeoffplans)                                                       | Gets a list of time off plans                                                                                                                            |
| [**getWorkforcemanagementManagementunitUserTimeoffrequest**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitUserTimeoffrequest)                                           | Get a time off request                                                                                                                                   |
| [**getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits)                 | Retrieves time off limit, allocated and waitlisted values according to specific time off request                                                         |
| [**getWorkforcemanagementManagementunitUserTimeoffrequests**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitUserTimeoffrequests)                                         | Get a list of time off requests for a given user                                                                                                         |
| [**getWorkforcemanagementManagementunitUsers**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitUsers)                                                                     | Get users in the management unit                                                                                                                         |
| [**getWorkforcemanagementManagementunitWeekSchedule**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitWeekSchedule)                                                       | Deprecated. Use the equivalent business unit resource instead. Get a week schedule                                                                       |
| [**getWorkforcemanagementManagementunitWeekSchedules**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitWeekSchedules)                                                     | Deprecated. Use the equivalent business unit resource instead. Get the list of schedules in a week in management unit                                    |
| [**getWorkforcemanagementManagementunitWeekShifttrades**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitWeekShifttrades)                                                 | Gets all the shift trades for a given week                                                                                                               |
| [**getWorkforcemanagementManagementunitWorkplan**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitWorkplan)                                                               | Get a work plan                                                                                                                                          |
| [**getWorkforcemanagementManagementunitWorkplanrotation**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitWorkplanrotation)                                               | Get a work plan rotation                                                                                                                                 |
| [**getWorkforcemanagementManagementunitWorkplanrotations**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitWorkplanrotations)                                             | Get work plan rotations                                                                                                                                  |
| [**getWorkforcemanagementManagementunitWorkplans**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitWorkplans)                                                             | Get work plans                                                                                                                                           |
| [**getWorkforcemanagementManagementunits**](WorkforceManagementApi.md#getWorkforcemanagementManagementunits)                                                                             | Get management units                                                                                                                                     |
| [**getWorkforcemanagementManagementunitsDivisionviews**](WorkforceManagementApi.md#getWorkforcemanagementManagementunitsDivisionviews)                                                   | Get management units across divisions                                                                                                                    |
| [**getWorkforcemanagementNotifications**](WorkforceManagementApi.md#getWorkforcemanagementNotifications)                                                                                 | Get a list of notifications for the current user                                                                                                         |
| [**getWorkforcemanagementSchedulingjob**](WorkforceManagementApi.md#getWorkforcemanagementSchedulingjob)                                                                                 | Get status of the scheduling job                                                                                                                         |
| [**getWorkforcemanagementShifttrades**](WorkforceManagementApi.md#getWorkforcemanagementShifttrades)                                                                                     | Gets all of my shift trades                                                                                                                              |
| [**getWorkforcemanagementTimeoffrequest**](WorkforceManagementApi.md#getWorkforcemanagementTimeoffrequest)                                                                               | Get a time off request for the current user                                                                                                              |
| [**getWorkforcemanagementTimeoffrequestWaitlistpositions**](WorkforceManagementApi.md#getWorkforcemanagementTimeoffrequestWaitlistpositions)                                             | Get the daily waitlist positions of a time off request for the current user                                                                              |
| [**getWorkforcemanagementTimeoffrequests**](WorkforceManagementApi.md#getWorkforcemanagementTimeoffrequests)                                                                             | Get a list of time off requests for the current user                                                                                                     |
| [**patchWorkforcemanagementBusinessunit**](WorkforceManagementApi.md#patchWorkforcemanagementBusinessunit)                                                                               | Update business unit                                                                                                                                     |
| [**patchWorkforcemanagementBusinessunitActivitycode**](WorkforceManagementApi.md#patchWorkforcemanagementBusinessunitActivitycode)                                                       | Update an activity code                                                                                                                                  |
| [**patchWorkforcemanagementBusinessunitPlanninggroup**](WorkforceManagementApi.md#patchWorkforcemanagementBusinessunitPlanninggroup)                                                     | Updates the planning group                                                                                                                               |
| [**patchWorkforcemanagementBusinessunitSchedulingRun**](WorkforceManagementApi.md#patchWorkforcemanagementBusinessunitSchedulingRun)                                                     | Mark a schedule run as applied                                                                                                                           |
| [**patchWorkforcemanagementBusinessunitServicegoaltemplate**](WorkforceManagementApi.md#patchWorkforcemanagementBusinessunitServicegoaltemplate)                                         | Updates a service goal template                                                                                                                          |
| [**patchWorkforcemanagementManagementunit**](WorkforceManagementApi.md#patchWorkforcemanagementManagementunit)                                                                           | Update the requested management unit                                                                                                                     |
| [**patchWorkforcemanagementManagementunitTimeofflimit**](WorkforceManagementApi.md#patchWorkforcemanagementManagementunitTimeofflimit)                                                   | Updates a time off limit object.                                                                                                                         |
| [**patchWorkforcemanagementManagementunitTimeoffplan**](WorkforceManagementApi.md#patchWorkforcemanagementManagementunitTimeoffplan)                                                     | Updates a time off plan                                                                                                                                  |
| [**patchWorkforcemanagementManagementunitUserTimeoffrequest**](WorkforceManagementApi.md#patchWorkforcemanagementManagementunitUserTimeoffrequest)                                       | Update a time off request                                                                                                                                |
| [**patchWorkforcemanagementManagementunitWeekShifttrade**](WorkforceManagementApi.md#patchWorkforcemanagementManagementunitWeekShifttrade)                                               | Updates a shift trade. This route can only be called by the initiating agent                                                                             |
| [**patchWorkforcemanagementManagementunitWorkplan**](WorkforceManagementApi.md#patchWorkforcemanagementManagementunitWorkplan)                                                           | Update a work plan                                                                                                                                       |
| [**patchWorkforcemanagementManagementunitWorkplanrotation**](WorkforceManagementApi.md#patchWorkforcemanagementManagementunitWorkplanrotation)                                           | Update a work plan rotation                                                                                                                              |
| [**patchWorkforcemanagementTimeoffrequest**](WorkforceManagementApi.md#patchWorkforcemanagementTimeoffrequest)                                                                           | Update a time off request for the current user                                                                                                           |
| [**postWorkforcemanagementAdherenceHistorical**](WorkforceManagementApi.md#postWorkforcemanagementAdherenceHistorical)                                                                   | Request a historical adherence report for users across management units                                                                                  |
| [**postWorkforcemanagementAgentschedulesMine**](WorkforceManagementApi.md#postWorkforcemanagementAgentschedulesMine)                                                                     | Get published schedule for the current user                                                                                                              |
| [**postWorkforcemanagementBusinessunitActivitycodes**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitActivitycodes)                                                       | Create a new activity code                                                                                                                               |
| [**postWorkforcemanagementBusinessunitAgentschedulesSearch**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitAgentschedulesSearch)                                         | Search published schedules                                                                                                                               |
| [**postWorkforcemanagementBusinessunitIntraday**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitIntraday)                                                                 | Get intraday data for the given date for the requested planningGroupIds                                                                                  |
| [**postWorkforcemanagementBusinessunitPlanninggroups**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitPlanninggroups)                                                     | Adds a new planning group                                                                                                                                |
| [**postWorkforcemanagementBusinessunitServicegoaltemplates**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitServicegoaltemplates)                                         | Adds a new service goal template                                                                                                                         |
| [**postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery)                   | Loads agent schedule data from the schedule. Used in combination with the metadata route                                                                 |
| [**postWorkforcemanagementBusinessunitWeekScheduleCopy**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekScheduleCopy)                                                 | Copy a schedule                                                                                                                                          |
| [**postWorkforcemanagementBusinessunitWeekScheduleReschedule**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekScheduleReschedule)                                     | Start a rescheduling run                                                                                                                                 |
| [**postWorkforcemanagementBusinessunitWeekScheduleUpdate**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekScheduleUpdate)                                             | Starts processing a schedule update                                                                                                                      |
| [**postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl)                           | Creates a signed upload URL for updating a schedule                                                                                                      |
| [**postWorkforcemanagementBusinessunitWeekSchedules**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekSchedules)                                                       | Create a blank schedule                                                                                                                                  |
| [**postWorkforcemanagementBusinessunitWeekSchedulesGenerate**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekSchedulesGenerate)                                       | Generate a schedule                                                                                                                                      |
| [**postWorkforcemanagementBusinessunitWeekSchedulesImport**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekSchedulesImport)                                           | Starts processing a schedule import                                                                                                                      |
| [**postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl)                         | Creates a signed upload URL for importing a schedule                                                                                                     |
| [**postWorkforcemanagementBusinessunitWeekShorttermforecastCopy**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekShorttermforecastCopy)                               | Copy a short term forecast                                                                                                                               |
| [**postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate)                     | Generate a short term forecast                                                                                                                           |
| [**postWorkforcemanagementBusinessunitWeekShorttermforecastsImport**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekShorttermforecastsImport)                         | Starts importing the uploaded short term forecast                                                                                                        |
| [**postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl)       | Creates a signed upload URL for importing a short term forecast                                                                                          |
| [**postWorkforcemanagementBusinessunits**](WorkforceManagementApi.md#postWorkforcemanagementBusinessunits)                                                                               | Add a new business unit                                                                                                                                  |
| [**postWorkforcemanagementCalendarUrlIcs**](WorkforceManagementApi.md#postWorkforcemanagementCalendarUrlIcs)                                                                             | Create a newly generated calendar link for the current user; if the current user has previously generated one, the generated link will be returned       |
| [**postWorkforcemanagementHistoricaldataDeletejob**](WorkforceManagementApi.md#postWorkforcemanagementHistoricaldataDeletejob)                                                           | Delete the entries of the historical data imports in the organization                                                                                    |
| [**postWorkforcemanagementHistoricaldataValidate**](WorkforceManagementApi.md#postWorkforcemanagementHistoricaldataValidate)                                                             | Trigger validation process for historical import                                                                                                         |
| [**postWorkforcemanagementManagementunitAgentschedulesSearch**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitAgentschedulesSearch)                                     | Query published schedules for given given time range for set of users                                                                                    |
| [**postWorkforcemanagementManagementunitHistoricaladherencequery**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitHistoricaladherencequery)                             | Request a historical adherence report                                                                                                                    |
| [**postWorkforcemanagementManagementunitMove**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitMove)                                                                     | Move the requested management unit to a new business unit                                                                                                |
| [**postWorkforcemanagementManagementunitSchedulesSearch**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitSchedulesSearch)                                               | Query published schedules for given given time range for set of users                                                                                    |
| [**postWorkforcemanagementManagementunitTimeofflimits**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitTimeofflimits)                                                   | Creates a new time off limit object under management unit.                                                                                               |
| [**postWorkforcemanagementManagementunitTimeofflimitsValuesQuery**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitTimeofflimitsValuesQuery)                             | Retrieves time off limit related values based on a given set of filters.                                                                                 |
| [**postWorkforcemanagementManagementunitTimeoffplans**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitTimeoffplans)                                                     | Creates a new time off plan                                                                                                                              |
| [**postWorkforcemanagementManagementunitTimeoffrequests**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitTimeoffrequests)                                               | Create a new time off request                                                                                                                            |
| [**postWorkforcemanagementManagementunitTimeoffrequestsQuery**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitTimeoffrequestsQuery)                                     | Fetches time off requests matching the conditions specified in the request body                                                                          |
| [**postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery)   | Retrieves daily waitlist position for a list of time off requests                                                                                        |
| [**postWorkforcemanagementManagementunitWeekShifttradeMatch**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitWeekShifttradeMatch)                                       | Matches a shift trade. This route can only be called by the receiving agent                                                                              |
| [**postWorkforcemanagementManagementunitWeekShifttrades**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitWeekShifttrades)                                               | Adds a shift trade                                                                                                                                       |
| [**postWorkforcemanagementManagementunitWeekShifttradesSearch**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitWeekShifttradesSearch)                                   | Searches for potential shift trade matches for the current agent                                                                                         |
| [**postWorkforcemanagementManagementunitWeekShifttradesStateBulk**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitWeekShifttradesStateBulk)                             | Updates the state of a batch of shift trades                                                                                                             |
| [**postWorkforcemanagementManagementunitWorkplanCopy**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitWorkplanCopy)                                                     | Create a copy of work plan                                                                                                                               |
| [**postWorkforcemanagementManagementunitWorkplanValidate**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitWorkplanValidate)                                             | Validate Work Plan                                                                                                                                       |
| [**postWorkforcemanagementManagementunitWorkplanrotationCopy**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitWorkplanrotationCopy)                                     | Create a copy of work plan rotation                                                                                                                      |
| [**postWorkforcemanagementManagementunitWorkplanrotations**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitWorkplanrotations)                                           | Create a new work plan rotation                                                                                                                          |
| [**postWorkforcemanagementManagementunitWorkplans**](WorkforceManagementApi.md#postWorkforcemanagementManagementunitWorkplans)                                                           | Create a new work plan                                                                                                                                   |
| [**postWorkforcemanagementManagementunits**](WorkforceManagementApi.md#postWorkforcemanagementManagementunits)                                                                           | Add a management unit                                                                                                                                    |
| [**postWorkforcemanagementNotificationsUpdate**](WorkforceManagementApi.md#postWorkforcemanagementNotificationsUpdate)                                                                   | Mark a list of notifications as read or unread                                                                                                           |
| [**postWorkforcemanagementSchedules**](WorkforceManagementApi.md#postWorkforcemanagementSchedules)                                                                                       | Get published schedule for the current user                                                                                                              |
| [**postWorkforcemanagementTimeofflimitsAvailableQuery**](WorkforceManagementApi.md#postWorkforcemanagementTimeofflimitsAvailableQuery)                                                   | Queries available time off for the current user                                                                                                          |
| [**postWorkforcemanagementTimeoffrequests**](WorkforceManagementApi.md#postWorkforcemanagementTimeoffrequests)                                                                           | Create a time off request for the current user                                                                                                           |
| [**putWorkforcemanagementManagementunitTimeofflimitValues**](WorkforceManagementApi.md#putWorkforcemanagementManagementunitTimeofflimitValues)                                           | Sets daily values for a date range of time off limit object                                                                                              |

{: class="table-striped"}

<a name="deleteWorkforcemanagementBusinessunit"></a>

# **deleteWorkforcemanagementBusinessunit**

> Void deleteWorkforcemanagementBusinessunit(businessUnitId)

Delete business unit

A business unit cannot be deleted if it contains one or more management units

Wraps DELETE /api/v2/workforcemanagement/businessunits/{businessUnitId}

Requires ANY permissions:

- wfm:businessUnit:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit, or 'mine' for the business unit of the logged-in user.
try {
    apiInstance.deleteWorkforcemanagementBusinessunit(businessUnitId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementBusinessunit");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                                                                                 | Notes |
| ------------------ | ---------- | ------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String** | The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementBusinessunitActivitycode"></a>

# **deleteWorkforcemanagementBusinessunitActivitycode**

> Void deleteWorkforcemanagementBusinessunitActivitycode(businessUnitId, activityCodeId)

Deletes an activity code

Wraps DELETE /api/v2/workforcemanagement/businessunits/{businessUnitId}/activitycodes/{activityCodeId}

Requires ANY permissions:

- wfm:activityCode:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit, or 'mine' for the business unit of the logged-in user.
String activityCodeId = "activityCodeId_example"; // String | The ID of the activity code to delete
try {
    apiInstance.deleteWorkforcemanagementBusinessunitActivitycode(businessUnitId, activityCodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementBusinessunitActivitycode");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                                                                                 | Notes |
| ------------------ | ---------- | ------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String** | The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. |
| **activityCodeId** | **String** | The ID of the activity code to delete                                                       |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementBusinessunitPlanninggroup"></a>

# **deleteWorkforcemanagementBusinessunitPlanninggroup**

> Void deleteWorkforcemanagementBusinessunitPlanninggroup(businessUnitId, planningGroupId)

Deletes the planning group

Wraps DELETE /api/v2/workforcemanagement/businessunits/{businessUnitId}/planninggroups/{planningGroupId}

Requires ANY permissions:

- wfm:planningGroup:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit.
String planningGroupId = "planningGroupId_example"; // String | The ID of a planning group to delete
try {
    apiInstance.deleteWorkforcemanagementBusinessunitPlanninggroup(businessUnitId, planningGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementBusinessunitPlanninggroup");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                          | Notes |
| ------------------- | ---------- | ------------------------------------ | ----- |
| **businessUnitId**  | **String** | The ID of the business unit.         |
| **planningGroupId** | **String** | The ID of a planning group to delete |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementBusinessunitSchedulingRun"></a>

# **deleteWorkforcemanagementBusinessunitSchedulingRun**

> Void deleteWorkforcemanagementBusinessunitSchedulingRun(businessUnitId, runId)

Cancel a scheduling run

Wraps DELETE /api/v2/workforcemanagement/businessunits/{businessUnitId}/scheduling/runs/{runId}

Requires ANY permissions:

- wfm:schedule:generate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
String runId = "runId_example"; // String | The ID of the schedule run
try {
    apiInstance.deleteWorkforcemanagementBusinessunitSchedulingRun(businessUnitId, runId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementBusinessunitSchedulingRun");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                 | Notes |
| ------------------ | ---------- | --------------------------- | ----- |
| **businessUnitId** | **String** | The ID of the business unit |
| **runId**          | **String** | The ID of the schedule run  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementBusinessunitServicegoaltemplate"></a>

# **deleteWorkforcemanagementBusinessunitServicegoaltemplate**

> Void deleteWorkforcemanagementBusinessunitServicegoaltemplate(businessUnitId, serviceGoalTemplateId)

Delete a service goal template

Wraps DELETE /api/v2/workforcemanagement/businessunits/{businessUnitId}/servicegoaltemplates/{serviceGoalTemplateId}

Requires ANY permissions:

- wfm:serviceGoalTemplate:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit.
String serviceGoalTemplateId = "serviceGoalTemplateId_example"; // String | The ID of the service goal template to delete
try {
    apiInstance.deleteWorkforcemanagementBusinessunitServicegoaltemplate(businessUnitId, serviceGoalTemplateId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementBusinessunitServicegoaltemplate");
    e.printStackTrace();
}
```

### Parameters

| Name                      | Type       | Description                                   | Notes |
| ------------------------- | ---------- | --------------------------------------------- | ----- |
| **businessUnitId**        | **String** | The ID of the business unit.                  |
| **serviceGoalTemplateId** | **String** | The ID of the service goal template to delete |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementBusinessunitWeekSchedule"></a>

# **deleteWorkforcemanagementBusinessunitWeekSchedule**

> [BuAsyncScheduleResponse](BuAsyncScheduleResponse.md) deleteWorkforcemanagementBusinessunitWeekSchedule(businessUnitId, weekId, scheduleId)

Delete a schedule

Wraps DELETE /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}

Requires ANY permissions:

- wfm:schedule:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String scheduleId = "scheduleId_example"; // String | The ID of the schedule
try {
    BuAsyncScheduleResponse result = apiInstance.deleteWorkforcemanagementBusinessunitWeekSchedule(businessUnitId, weekId, scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementBusinessunitWeekSchedule");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type          | Description                                                                                                           | Notes |
| ------------------ | ------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**    | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate** | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **scheduleId**     | **String**    | The ID of the schedule                                                                                                |

{: class="table-striped"}

### Return type

[**BuAsyncScheduleResponse**](BuAsyncScheduleResponse.md)

<a name="deleteWorkforcemanagementBusinessunitWeekShorttermforecast"></a>

# **deleteWorkforcemanagementBusinessunitWeekShorttermforecast**

> Void deleteWorkforcemanagementBusinessunitWeekShorttermforecast(businessUnitId, weekDateId, forecastId)

Delete a short term forecast

Must not be tied to any schedules

Wraps DELETE /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/{forecastId}

Requires ANY permissions:

- wfm:shortTermForecast:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
LocalDate weekDateId = new LocalDate(); // LocalDate | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String forecastId = "forecastId_example"; // String | The ID of the forecast
try {
    apiInstance.deleteWorkforcemanagementBusinessunitWeekShorttermforecast(businessUnitId, weekDateId, forecastId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementBusinessunitWeekShorttermforecast");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type          | Description                                                                                                                    | Notes |
| ------------------ | ------------- | ------------------------------------------------------------------------------------------------------------------------------ | ----- |
| **businessUnitId** | **String**    | The business unit ID of the business unit to which the forecast belongs                                                        |
| **weekDateId**     | **LocalDate** | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **forecastId**     | **String**    | The ID of the forecast                                                                                                         |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementCalendarUrlIcs"></a>

# **deleteWorkforcemanagementCalendarUrlIcs**

> Void deleteWorkforcemanagementCalendarUrlIcs()

Disable generated calendar link for the current user

Wraps DELETE /api/v2/workforcemanagement/calendar/url/ics

Requires ALL permissions:

- wfm:agentSchedule:sync

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
try {
    apiInstance.deleteWorkforcemanagementCalendarUrlIcs();
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementCalendarUrlIcs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementManagementunit"></a>

# **deleteWorkforcemanagementManagementunit**

> Void deleteWorkforcemanagementManagementunit(managementUnitId)

Delete management unit

Wraps DELETE /api/v2/workforcemanagement/managementunits/{managementUnitId}

Requires ANY permissions:

- wfm:managementUnit:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
try {
    apiInstance.deleteWorkforcemanagementManagementunit(managementUnitId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementManagementunit");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                                                                     | Notes |
| -------------------- | ---------- | ----------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId** | **String** | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementManagementunitTimeofflimit"></a>

# **deleteWorkforcemanagementManagementunitTimeofflimit**

> Void deleteWorkforcemanagementManagementunitTimeofflimit(managementUnitId, timeOffLimitId)

Deletes a time off limit object

Wraps DELETE /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeofflimits/{timeOffLimitId}

Requires ANY permissions:

- wfm:timeOffLimit:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit.
String timeOffLimitId = "timeOffLimitId_example"; // String | The ID of the time off limit object to delete
try {
    apiInstance.deleteWorkforcemanagementManagementunitTimeofflimit(managementUnitId, timeOffLimitId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementManagementunitTimeofflimit");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                    | Notes |
| -------------------- | ---------- | ---------------------------------------------- | ----- |
| **managementUnitId** | **String** | The management unit ID of the management unit. |
| **timeOffLimitId**   | **String** | The ID of the time off limit object to delete  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementManagementunitTimeoffplan"></a>

# **deleteWorkforcemanagementManagementunitTimeoffplan**

> Void deleteWorkforcemanagementManagementunitTimeoffplan(managementUnitId, timeOffPlanId)

Deletes a time off plan

Wraps DELETE /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeoffplans/{timeOffPlanId}

Requires ANY permissions:

- wfm:timeOffPlan:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID.
String timeOffPlanId = "timeOffPlanId_example"; // String | The ID of the time off plan to delete
try {
    apiInstance.deleteWorkforcemanagementManagementunitTimeoffplan(managementUnitId, timeOffPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementManagementunitTimeoffplan");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                           | Notes |
| -------------------- | ---------- | ------------------------------------- | ----- |
| **managementUnitId** | **String** | The management unit ID.               |
| **timeOffPlanId**    | **String** | The ID of the time off plan to delete |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementManagementunitWorkplan"></a>

# **deleteWorkforcemanagementManagementunitWorkplan**

> Void deleteWorkforcemanagementManagementunitWorkplan(managementUnitId, workPlanId)

Delete a work plan

Wraps DELETE /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplans/{workPlanId}

Requires ANY permissions:

- wfm:workPlan:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String workPlanId = "workPlanId_example"; // String | The ID of the work plan to delete
try {
    apiInstance.deleteWorkforcemanagementManagementunitWorkplan(managementUnitId, workPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementManagementunitWorkplan");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                                                                     | Notes |
| -------------------- | ---------- | ----------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId** | **String** | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **workPlanId**       | **String** | The ID of the work plan to delete                                                               |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWorkforcemanagementManagementunitWorkplanrotation"></a>

# **deleteWorkforcemanagementManagementunitWorkplanrotation**

> Void deleteWorkforcemanagementManagementunitWorkplanrotation(managementUnitId, workPlanRotationId)

Delete a work plan rotation

Wraps DELETE /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplanrotations/{workPlanRotationId}

Requires ANY permissions:

- wfm:workPlanRotation:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String workPlanRotationId = "workPlanRotationId_example"; // String | The ID of the work plan rotation to be deleted
try {
    apiInstance.deleteWorkforcemanagementManagementunitWorkplanrotation(managementUnitId, workPlanRotationId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#deleteWorkforcemanagementManagementunitWorkplanrotation");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type       | Description                                                                                     | Notes |
| ---------------------- | ---------- | ----------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId**   | **String** | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **workPlanRotationId** | **String** | The ID of the work plan rotation to be deleted                                                  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getWorkforcemanagementAdherence"></a>

# **getWorkforcemanagementAdherence**

> [List&lt;UserScheduleAdherence&gt;](UserScheduleAdherence.md) getWorkforcemanagementAdherence(userId)

Get a list of UserScheduleAdherence records for the requested users

Wraps GET /api/v2/workforcemanagement/adherence

Requires ANY permissions:

- wfm:realtimeAdherence:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
List<String> userId = Arrays.asList("userId_example"); // List<String> | User Id(s) for which to fetch current schedule adherence information.  Min 1, Max of 100 userIds per request
try {
    List<UserScheduleAdherence> result = apiInstance.getWorkforcemanagementAdherence(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementAdherence");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                                                                                                 | Notes |
| ---------- | ----------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----- |
| **userId** | [**List&lt;String&gt;**](String.md) | User Id(s) for which to fetch current schedule adherence information. Min 1, Max of 100 userIds per request |

{: class="table-striped"}

### Return type

[**List&lt;UserScheduleAdherence&gt;**](UserScheduleAdherence.md)

<a name="getWorkforcemanagementAdhocmodelingjob"></a>

# **getWorkforcemanagementAdhocmodelingjob**

> [ModelingStatusResponse](ModelingStatusResponse.md) getWorkforcemanagementAdhocmodelingjob(jobId)

Get status of the modeling job

Wraps GET /api/v2/workforcemanagement/adhocmodelingjobs/{jobId}

Requires ANY permissions:

- wfm:adhocModel:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String jobId = "jobId_example"; // String | The id of the modeling job
try {
    ModelingStatusResponse result = apiInstance.getWorkforcemanagementAdhocmodelingjob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementAdhocmodelingjob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description                | Notes |
| --------- | ---------- | -------------------------- | ----- |
| **jobId** | **String** | The id of the modeling job |

{: class="table-striped"}

### Return type

[**ModelingStatusResponse**](ModelingStatusResponse.md)

<a name="getWorkforcemanagementAgentManagementunit"></a>

# **getWorkforcemanagementAgentManagementunit**

> [AgentManagementUnitReference](AgentManagementUnitReference.md) getWorkforcemanagementAgentManagementunit(agentId)

Get the management unit to which the agent belongs

Wraps GET /api/v2/workforcemanagement/agents/{agentId}/managementunit

Requires ANY permissions:

- wfm:agent:view
- wfm:publishedSchedule:view
- wfm:schedule:view
- coaching:appointment:add
- coaching:appointment:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String agentId = "agentId_example"; // String | The ID of the agent to look up
try {
    AgentManagementUnitReference result = apiInstance.getWorkforcemanagementAgentManagementunit(agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementAgentManagementunit");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description                    | Notes |
| ----------- | ---------- | ------------------------------ | ----- |
| **agentId** | **String** | The ID of the agent to look up |

{: class="table-striped"}

### Return type

[**AgentManagementUnitReference**](AgentManagementUnitReference.md)

<a name="getWorkforcemanagementAgentsMeManagementunit"></a>

# **getWorkforcemanagementAgentsMeManagementunit**

> [AgentManagementUnitReference](AgentManagementUnitReference.md) getWorkforcemanagementAgentsMeManagementunit()

Get the management unit to which the currently logged in agent belongs

Wraps GET /api/v2/workforcemanagement/agents/me/managementunit

Requires ANY permissions:

- wfm:agentSchedule:view
- wfm:agentTimeOffRequest:submit
- wfm:activityCode:add
- wfm:activityCode:delete
- wfm:activityCode:edit
- wfm:activityCode:view
- wfm:agent:edit
- wfm:agent:view
- wfm:businessUnit:add
- wfm:businessUnit:delete
- wfm:businessUnit:edit
- wfm:businessUnit:view
- wfm:historicalAdherence:view
- wfm:intraday:view
- wfm:managementUnit:add
- wfm:managementUnit:delete
- wfm:managementUnit:edit
- wfm:managementUnit:view
- wfm:realtimeAdherence:view
- wfm:schedule:add
- wfm:schedule:delete
- wfm:schedule:edit
- wfm:schedule:generate
- wfm:schedule:view
- wfm:publishedSchedule:view
- wfm:serviceGoalTemplate:add
- wfm:serviceGoalTemplate:delete
- wfm:serviceGoalTemplate:edit
- wfm:serviceGoalTemplate:view
- wfm:planningGroup:add
- wfm:planningGroup:delete
- wfm:planningGroup:edit
- wfm:planningGroup:view
- wfm:shiftTradeRequest:edit
- wfm:shiftTradeRequest:view
- wfm:shortTermForecast:add
- wfm:shortTermForecast:delete
- wfm:shortTermForecast:edit
- wfm:shortTermForecast:view
- wfm:timeOffLimit:add
- wfm:timeOffLimit:delete
- wfm:timeOffLimit:edit
- wfm:timeOffLimit:view
- wfm:timeOffPlan:add
- wfm:timeOffPlan:delete
- wfm:timeOffPlan:edit
- wfm:timeOffPlan:view
- wfm:timeOffRequest:add
- wfm:timeOffRequest:edit
- wfm:timeOffRequest:view
- wfm:workPlan:add
- wfm:workPlan:delete
- wfm:workPlan:edit
- wfm:workPlan:view
- wfm:workPlanRotation:add
- wfm:workPlanRotation:delete
- wfm:workPlanRotation:edit
- wfm:workPlanRotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
try {
    AgentManagementUnitReference result = apiInstance.getWorkforcemanagementAgentsMeManagementunit();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementAgentsMeManagementunit");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**AgentManagementUnitReference**](AgentManagementUnitReference.md)

<a name="getWorkforcemanagementBusinessunit"></a>

# **getWorkforcemanagementBusinessunit**

> [BusinessUnit](BusinessUnit.md) getWorkforcemanagementBusinessunit(businessUnitId, expand)

Get business unit

Expanding \&quot;settings\&quot; will retrieve all settings. All other expands will retrieve only the requested settings field(s).

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}

Requires ANY permissions:

- wfm:activityCode:add
- wfm:activityCode:delete
- wfm:activityCode:edit
- wfm:activityCode:view
- wfm:agent:edit
- wfm:agentSchedule:view
- wfm:agentTimeOffRequest:submit
- wfm:agent:view
- wfm:businessUnit:add
- wfm:businessUnit:delete
- wfm:businessUnit:edit
- wfm:businessUnit:view
- wfm:historicalAdherence:view
- wfm:intraday:view
- wfm:managementUnit:add
- wfm:managementUnit:delete
- wfm:managementUnit:edit
- wfm:managementUnit:view
- wfm:publishedSchedule:view
- wfm:realtimeAdherence:view
- wfm:schedule:add
- wfm:schedule:delete
- wfm:schedule:edit
- wfm:schedule:generate
- wfm:schedule:view
- wfm:serviceGoalTemplate:add
- wfm:serviceGoalTemplate:delete
- wfm:serviceGoalTemplate:edit
- wfm:serviceGoalTemplate:view
- wfm:planningGroup:add
- wfm:planningGroup:delete
- wfm:planningGroup:edit
- wfm:planningGroup:view
- wfm:shiftTradeRequest:edit
- wfm:shiftTradeRequest:view
- wfm:agentShiftTradeRequest:participate
- wfm:shortTermForecast:add
- wfm:shortTermForecast:delete
- wfm:shortTermForecast:edit
- wfm:shortTermForecast:view
- wfm:timeOffRequest:add
- wfm:timeOffRequest:edit
- wfm:timeOffRequest:view
- wfm:timeOffLimit:add
- wfm:timeOffLimit:delete
- wfm:timeOffLimit:edit
- wfm:timeOffLimit:view
- wfm:timeOffPlan:add
- wfm:timeOffPlan:delete
- wfm:timeOffPlan:edit
- wfm:timeOffPlan:view
- wfm:timeOffRequest:add
- wfm:timeOffRequest:edit
- wfm:timeOffRequest:view
- wfm:workPlan:add
- wfm:workPlan:delete
- wfm:workPlan:edit
- wfm:workPlan:view
- wfm:workPlanRotation:add
- wfm:workPlanRotation:delete
- wfm:workPlanRotation:edit
- wfm:workPlanRotation:view
- coaching:appointment:add
- coaching:appointment:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit, or 'mine' for the business unit of the logged-in user.
List<String> expand = Arrays.asList("expand_example"); // List<String> |
try {
    BusinessUnit result = apiInstance.getWorkforcemanagementBusinessunit(businessUnitId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunit");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description                                                                                 | Notes                                                                                                                                |
| ------------------ | ----------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| **businessUnitId** | **String**                          | The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. |
| **expand**         | [**List&lt;String&gt;**](String.md) |                                                                                             | [optional]<br />**Values**: settings, settings.timeZone, settings.startDayOfWeek, settings.shortTermForecasting, settings.scheduling |

{: class="table-striped"}

### Return type

[**BusinessUnit**](BusinessUnit.md)

<a name="getWorkforcemanagementBusinessunitActivitycode"></a>

# **getWorkforcemanagementBusinessunitActivitycode**

> [BusinessUnitActivityCode](BusinessUnitActivityCode.md) getWorkforcemanagementBusinessunitActivitycode(businessUnitId, activityCodeId)

Get an activity code

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/activitycodes/{activityCodeId}

Requires ANY permissions:

- wfm:activityCode:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit, or 'mine' for the business unit of the logged-in user.
String activityCodeId = "activityCodeId_example"; // String | The ID of the activity code to fetch
try {
    BusinessUnitActivityCode result = apiInstance.getWorkforcemanagementBusinessunitActivitycode(businessUnitId, activityCodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitActivitycode");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                                                                                 | Notes |
| ------------------ | ---------- | ------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String** | The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. |
| **activityCodeId** | **String** | The ID of the activity code to fetch                                                        |

{: class="table-striped"}

### Return type

[**BusinessUnitActivityCode**](BusinessUnitActivityCode.md)

<a name="getWorkforcemanagementBusinessunitActivitycodes"></a>

# **getWorkforcemanagementBusinessunitActivitycodes**

> [BusinessUnitActivityCodeListing](BusinessUnitActivityCodeListing.md) getWorkforcemanagementBusinessunitActivitycodes(businessUnitId)

Get activity codes

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/activitycodes

Requires ANY permissions:

- wfm:agentSchedule:view
- wfm:agentTimeOffRequest:submit
- wfm:activityCode:add
- wfm:activityCode:delete
- wfm:activityCode:edit
- wfm:activityCode:view
- wfm:agent:edit
- wfm:agent:view
- wfm:businessUnit:add
- wfm:businessUnit:delete
- wfm:businessUnit:edit
- wfm:businessUnit:view
- wfm:historicalAdherence:view
- wfm:intraday:view
- wfm:managementUnit:add
- wfm:managementUnit:delete
- wfm:managementUnit:edit
- wfm:managementUnit:view
- wfm:realtimeAdherence:view
- wfm:schedule:add
- wfm:schedule:delete
- wfm:schedule:edit
- wfm:schedule:generate
- wfm:schedule:view
- wfm:publishedSchedule:view
- wfm:serviceGoalTemplate:add
- wfm:serviceGoalTemplate:delete
- wfm:serviceGoalTemplate:edit
- wfm:serviceGoalTemplate:view
- wfm:planningGroup:add
- wfm:planningGroup:delete
- wfm:planningGroup:edit
- wfm:planningGroup:view
- wfm:shiftTradeRequest:edit
- wfm:shiftTradeRequest:view
- wfm:shortTermForecast:add
- wfm:shortTermForecast:delete
- wfm:shortTermForecast:edit
- wfm:shortTermForecast:view
- wfm:timeOffLimit:add
- wfm:timeOffLimit:delete
- wfm:timeOffLimit:edit
- wfm:timeOffLimit:view
- wfm:timeOffPlan:add
- wfm:timeOffPlan:delete
- wfm:timeOffPlan:edit
- wfm:timeOffPlan:view
- wfm:timeOffRequest:add
- wfm:timeOffRequest:edit
- wfm:timeOffRequest:view
- wfm:workPlan:add
- wfm:workPlan:delete
- wfm:workPlan:edit
- wfm:workPlan:view
- wfm:workPlanRotation:add
- wfm:workPlanRotation:delete
- wfm:workPlanRotation:edit
- wfm:workPlanRotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit, or 'mine' for the business unit of the logged-in user.
try {
    BusinessUnitActivityCodeListing result = apiInstance.getWorkforcemanagementBusinessunitActivitycodes(businessUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitActivitycodes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                                                                                 | Notes |
| ------------------ | ---------- | ------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String** | The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. |

{: class="table-striped"}

### Return type

[**BusinessUnitActivityCodeListing**](BusinessUnitActivityCodeListing.md)

<a name="getWorkforcemanagementBusinessunitIntradayPlanninggroups"></a>

# **getWorkforcemanagementBusinessunitIntradayPlanninggroups**

> [WfmIntradayPlanningGroupListing](WfmIntradayPlanningGroupListing.md) getWorkforcemanagementBusinessunitIntradayPlanninggroups(businessUnitId, date)

Get intraday planning groups for the given date

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/intraday/planninggroups

Requires ANY permissions:

- wfm:intraday:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit
LocalDate date = new LocalDate(); // LocalDate | yyyy-MM-dd date string interpreted in the configured business unit time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    WfmIntradayPlanningGroupListing result = apiInstance.getWorkforcemanagementBusinessunitIntradayPlanninggroups(businessUnitId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitIntradayPlanninggroups");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type          | Description                                                                                                                                        | Notes |
| ------------------ | ------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**    | The business unit ID of the business unit                                                                                                          |
| **date**           | **LocalDate** | yyyy-MM-dd date string interpreted in the configured business unit time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |

{: class="table-striped"}

### Return type

[**WfmIntradayPlanningGroupListing**](WfmIntradayPlanningGroupListing.md)

<a name="getWorkforcemanagementBusinessunitManagementunits"></a>

# **getWorkforcemanagementBusinessunitManagementunits**

> [ManagementUnitListing](ManagementUnitListing.md) getWorkforcemanagementBusinessunitManagementunits(businessUnitId, feature, divisionId)

Get all authorized management units in the business unit

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/managementunits

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit, or 'mine' for the business unit of the logged-in user.
String feature = "feature_example"; // String |
String divisionId = "divisionId_example"; // String |
try {
    ManagementUnitListing result = apiInstance.getWorkforcemanagementBusinessunitManagementunits(businessUnitId, feature, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitManagementunits");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                                                                                 | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| ------------------ | ---------- | ------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **businessUnitId** | **String** | The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. |
| **feature**        | **String** |                                                                                             | [optional]<br />**Values**: AgentSchedule, AgentTimeOffRequest, Coaching, CoachingDivisioned, ActivityCodes, Agents, BuActivityCodes, BusinessUnits, HistoricalAdherence, HistoricalShrinkage, IntradayMonitoring, BuIntradayMonitoring, ManagementUnits, RealTimeAdherence, Schedules, BuSchedules, ServiceGoalTemplates, PlanningGroups, ShiftTrading, ShortTermForecasts, BuShortTermForecasts, TimeOffPlans, TimeOffRequests, TimeOffLimits, WorkPlanRotations, WorkPlans |
| **divisionId**     | **String** |                                                                                             | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |

{: class="table-striped"}

### Return type

[**ManagementUnitListing**](ManagementUnitListing.md)

<a name="getWorkforcemanagementBusinessunitPlanninggroup"></a>

# **getWorkforcemanagementBusinessunitPlanninggroup**

> [PlanningGroup](PlanningGroup.md) getWorkforcemanagementBusinessunitPlanninggroup(businessUnitId, planningGroupId)

Get a planning group

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/planninggroups/{planningGroupId}

Requires ANY permissions:

- wfm:planningGroup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit.
String planningGroupId = "planningGroupId_example"; // String | The ID of a planning group to fetch
try {
    PlanningGroup result = apiInstance.getWorkforcemanagementBusinessunitPlanninggroup(businessUnitId, planningGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitPlanninggroup");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                         | Notes |
| ------------------- | ---------- | ----------------------------------- | ----- |
| **businessUnitId**  | **String** | The ID of the business unit.        |
| **planningGroupId** | **String** | The ID of a planning group to fetch |

{: class="table-striped"}

### Return type

[**PlanningGroup**](PlanningGroup.md)

<a name="getWorkforcemanagementBusinessunitPlanninggroups"></a>

# **getWorkforcemanagementBusinessunitPlanninggroups**

> [PlanningGroupList](PlanningGroupList.md) getWorkforcemanagementBusinessunitPlanninggroups(businessUnitId)

Gets list of planning groups

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/planninggroups

Requires ANY permissions:

- wfm:planningGroup:view
- wfm:shortTermForecast:view
- wfm:intraday:view
- wfm:agent:view
- wfm:schedule:view
- wfm:publishedSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit.
try {
    PlanningGroupList result = apiInstance.getWorkforcemanagementBusinessunitPlanninggroups(businessUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitPlanninggroups");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                  | Notes |
| ------------------ | ---------- | ---------------------------- | ----- |
| **businessUnitId** | **String** | The ID of the business unit. |

{: class="table-striped"}

### Return type

[**PlanningGroupList**](PlanningGroupList.md)

<a name="getWorkforcemanagementBusinessunitSchedulingRun"></a>

# **getWorkforcemanagementBusinessunitSchedulingRun**

> [BuScheduleRun](BuScheduleRun.md) getWorkforcemanagementBusinessunitSchedulingRun(businessUnitId, runId)

Get a scheduling run

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/scheduling/runs/{runId}

Requires ANY permissions:

- wfm:schedule:generate
- wfm:schedule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
String runId = "runId_example"; // String | The ID of the schedule run
try {
    BuScheduleRun result = apiInstance.getWorkforcemanagementBusinessunitSchedulingRun(businessUnitId, runId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitSchedulingRun");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                 | Notes |
| ------------------ | ---------- | --------------------------- | ----- |
| **businessUnitId** | **String** | The ID of the business unit |
| **runId**          | **String** | The ID of the schedule run  |

{: class="table-striped"}

### Return type

[**BuScheduleRun**](BuScheduleRun.md)

<a name="getWorkforcemanagementBusinessunitSchedulingRunResult"></a>

# **getWorkforcemanagementBusinessunitSchedulingRunResult**

> [BuRescheduleResult](BuRescheduleResult.md) getWorkforcemanagementBusinessunitSchedulingRunResult(businessUnitId, runId, managementUnitIds, expand)

Get the result of a rescheduling operation

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/scheduling/runs/{runId}/result

Requires ANY permissions:

- wfm:schedule:edit
- wfm:schedule:generate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
String runId = "runId_example"; // String | The ID of the schedule run
List<String> managementUnitIds = Arrays.asList("managementUnitIds_example"); // List<String> | The IDs of the management units for which to fetch the reschedule results
List<String> expand = Arrays.asList("expand_example"); // List<String> | The fields to expand. Omitting will return an empty response
try {
    BuRescheduleResult result = apiInstance.getWorkforcemanagementBusinessunitSchedulingRunResult(businessUnitId, runId, managementUnitIds, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitSchedulingRunResult");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type                                | Description                                                               | Notes                                                                  |
| --------------------- | ----------------------------------- | ------------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| **businessUnitId**    | **String**                          | The ID of the business unit                                               |
| **runId**             | **String**                          | The ID of the schedule run                                                |
| **managementUnitIds** | [**List&lt;String&gt;**](String.md) | The IDs of the management units for which to fetch the reschedule results |
| **expand**            | [**List&lt;String&gt;**](String.md) | The fields to expand. Omitting will return an empty response              | <br />**Values**: headcountForecast, generationResults, agentSchedules |

{: class="table-striped"}

### Return type

[**BuRescheduleResult**](BuRescheduleResult.md)

<a name="getWorkforcemanagementBusinessunitSchedulingRuns"></a>

# **getWorkforcemanagementBusinessunitSchedulingRuns**

> [BuScheduleRunListing](BuScheduleRunListing.md) getWorkforcemanagementBusinessunitSchedulingRuns(businessUnitId)

Get the list of scheduling runs

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/scheduling/runs

Requires ANY permissions:

- wfm:schedule:generate
- wfm:schedule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
try {
    BuScheduleRunListing result = apiInstance.getWorkforcemanagementBusinessunitSchedulingRuns(businessUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitSchedulingRuns");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                 | Notes |
| ------------------ | ---------- | --------------------------- | ----- |
| **businessUnitId** | **String** | The ID of the business unit |

{: class="table-striped"}

### Return type

[**BuScheduleRunListing**](BuScheduleRunListing.md)

<a name="getWorkforcemanagementBusinessunitServicegoaltemplate"></a>

# **getWorkforcemanagementBusinessunitServicegoaltemplate**

> [ServiceGoalTemplate](ServiceGoalTemplate.md) getWorkforcemanagementBusinessunitServicegoaltemplate(businessUnitId, serviceGoalTemplateId)

Get a service goal template

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/servicegoaltemplates/{serviceGoalTemplateId}

Requires ANY permissions:

- wfm:serviceGoalTemplate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit.
String serviceGoalTemplateId = "serviceGoalTemplateId_example"; // String | The ID of a service goal template to fetch
try {
    ServiceGoalTemplate result = apiInstance.getWorkforcemanagementBusinessunitServicegoaltemplate(businessUnitId, serviceGoalTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitServicegoaltemplate");
    e.printStackTrace();
}
```

### Parameters

| Name                      | Type       | Description                                | Notes |
| ------------------------- | ---------- | ------------------------------------------ | ----- |
| **businessUnitId**        | **String** | The ID of the business unit.               |
| **serviceGoalTemplateId** | **String** | The ID of a service goal template to fetch |

{: class="table-striped"}

### Return type

[**ServiceGoalTemplate**](ServiceGoalTemplate.md)

<a name="getWorkforcemanagementBusinessunitServicegoaltemplates"></a>

# **getWorkforcemanagementBusinessunitServicegoaltemplates**

> [ServiceGoalTemplateList](ServiceGoalTemplateList.md) getWorkforcemanagementBusinessunitServicegoaltemplates(businessUnitId)

Gets list of service goal templates

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/servicegoaltemplates

Requires ANY permissions:

- wfm:serviceGoalTemplate:view
- wfm:planningGroup:view
- wfm:shortTermForecast:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit.
try {
    ServiceGoalTemplateList result = apiInstance.getWorkforcemanagementBusinessunitServicegoaltemplates(businessUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitServicegoaltemplates");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                  | Notes |
| ------------------ | ---------- | ---------------------------- | ----- |
| **businessUnitId** | **String** | The ID of the business unit. |

{: class="table-striped"}

### Return type

[**ServiceGoalTemplateList**](ServiceGoalTemplateList.md)

<a name="getWorkforcemanagementBusinessunitWeekSchedule"></a>

# **getWorkforcemanagementBusinessunitWeekSchedule**

> [BuScheduleMetadata](BuScheduleMetadata.md) getWorkforcemanagementBusinessunitWeekSchedule(businessUnitId, weekId, scheduleId, expand)

Get the metadata for the schedule, describing which management units and agents are in the scheduleSchedule data can then be loaded with the query route

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}

Requires ANY permissions:

- wfm:schedule:view
- wfm:publishedSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String scheduleId = "scheduleId_example"; // String | The ID of the schedule
String expand = "expand_example"; // String | expand
try {
    BuScheduleMetadata result = apiInstance.getWorkforcemanagementBusinessunitWeekSchedule(businessUnitId, weekId, scheduleId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekSchedule");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type          | Description                                                                                                           | Notes                                              |
| ------------------ | ------------- | --------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------- |
| **businessUnitId** | **String**    | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate** | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **scheduleId**     | **String**    | The ID of the schedule                                                                                                |
| **expand**         | **String**    | expand                                                                                                                | [optional]<br />**Values**: managementUnits.agents |

{: class="table-striped"}

### Return type

[**BuScheduleMetadata**](BuScheduleMetadata.md)

<a name="getWorkforcemanagementBusinessunitWeekScheduleGenerationresults"></a>

# **getWorkforcemanagementBusinessunitWeekScheduleGenerationresults**

> [ScheduleGenerationResult](ScheduleGenerationResult.md) getWorkforcemanagementBusinessunitWeekScheduleGenerationresults(businessUnitId, weekId, scheduleId)

Get the generation results for a generated schedule

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}/generationresults

Requires ANY permissions:

- wfm:schedule:view
- wfm:publishedSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String scheduleId = "scheduleId_example"; // String | The ID of the schedule
try {
    ScheduleGenerationResult result = apiInstance.getWorkforcemanagementBusinessunitWeekScheduleGenerationresults(businessUnitId, weekId, scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekScheduleGenerationresults");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type          | Description                                                                                                           | Notes |
| ------------------ | ------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**    | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate** | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **scheduleId**     | **String**    | The ID of the schedule                                                                                                |

{: class="table-striped"}

### Return type

[**ScheduleGenerationResult**](ScheduleGenerationResult.md)

<a name="getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast"></a>

# **getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast**

> [BuHeadcountForecastResponse](BuHeadcountForecastResponse.md) getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast(businessUnitId, weekId, scheduleId, forceDownload)

Get the headcount forecast by planning group for the schedule

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}/headcountforecast

Requires ANY permissions:

- wfm:schedule:view
- wfm:publishedSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String scheduleId = "scheduleId_example"; // String | The ID of the schedule
Boolean forceDownload = true; // Boolean | Whether to force the result to come via download url.  For testing purposes only
try {
    BuHeadcountForecastResponse result = apiInstance.getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast(businessUnitId, weekId, scheduleId, forceDownload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type          | Description                                                                                                           | Notes      |
| ------------------ | ------------- | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **businessUnitId** | **String**    | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate** | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **scheduleId**     | **String**    | The ID of the schedule                                                                                                |
| **forceDownload**  | **Boolean**   | Whether to force the result to come via download url. For testing purposes only                                       | [optional] |

{: class="table-striped"}

### Return type

[**BuHeadcountForecastResponse**](BuHeadcountForecastResponse.md)

<a name="getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent"></a>

# **getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent**

> [BuAgentScheduleHistoryResponse](BuAgentScheduleHistoryResponse.md) getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent(businessUnitId, weekId, scheduleId, agentId)

Loads agent&#39;s schedule history.

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}/history/agents/{agentId}

Requires ANY permissions:

- wfm:schedule:view
- wfm:publishedSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String scheduleId = "scheduleId_example"; // String | The ID of the schedule
String agentId = "agentId_example"; // String | THe ID of the agent
try {
    BuAgentScheduleHistoryResponse result = apiInstance.getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent(businessUnitId, weekId, scheduleId, agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type          | Description                                                                                                           | Notes |
| ------------------ | ------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**    | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate** | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **scheduleId**     | **String**    | The ID of the schedule                                                                                                |
| **agentId**        | **String**    | THe ID of the agent                                                                                                   |

{: class="table-striped"}

### Return type

[**BuAgentScheduleHistoryResponse**](BuAgentScheduleHistoryResponse.md)

<a name="getWorkforcemanagementBusinessunitWeekSchedules"></a>

# **getWorkforcemanagementBusinessunitWeekSchedules**

> [BuScheduleListing](BuScheduleListing.md) getWorkforcemanagementBusinessunitWeekSchedules(businessUnitId, weekId, includeOnlyPublished, expand)

Get the list of week schedules for the specified week

Use \&quot;recent\&quot; (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules

Requires ANY permissions:

- wfm:schedule:view
- wfm:publishedSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
String weekId = "weekId_example"; // String | First day of schedule week in yyyy-MM-dd format, or 'recent' (without quotes) to get recent schedules
Boolean includeOnlyPublished = true; // Boolean | includeOnlyPublished
String expand = "expand_example"; // String | expand
try {
    BuScheduleListing result = apiInstance.getWorkforcemanagementBusinessunitWeekSchedules(businessUnitId, weekId, includeOnlyPublished, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekSchedules");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type        | Description                                                                                                   | Notes                                            |
| ------------------------ | ----------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------ |
| **businessUnitId**       | **String**  | The ID of the business unit                                                                                   |
| **weekId**               | **String**  | First day of schedule week in yyyy-MM-dd format, or &#39;recent&#39; (without quotes) to get recent schedules |
| **includeOnlyPublished** | **Boolean** | includeOnlyPublished                                                                                          | [optional]                                       |
| **expand**               | **String**  | expand                                                                                                        | [optional]<br />**Values**: forecast.description |

{: class="table-striped"}

### Return type

[**BuScheduleListing**](BuScheduleListing.md)

<a name="getWorkforcemanagementBusinessunitWeekShorttermforecast"></a>

# **getWorkforcemanagementBusinessunitWeekShorttermforecast**

> [BuShortTermForecast](BuShortTermForecast.md) getWorkforcemanagementBusinessunitWeekShorttermforecast(businessUnitId, weekDateId, forecastId, expand)

Get a short term forecast

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/{forecastId}

Requires ANY permissions:

- wfm:shortTermForecast:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
LocalDate weekDateId = new LocalDate(); // LocalDate | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String forecastId = "forecastId_example"; // String | The ID of the forecast
List<String> expand = Arrays.asList("expand_example"); // List<String> |
try {
    BuShortTermForecast result = apiInstance.getWorkforcemanagementBusinessunitWeekShorttermforecast(businessUnitId, weekDateId, forecastId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekShorttermforecast");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description                                                                                                                    | Notes                                                         |
| ------------------ | ----------------------------------- | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------- |
| **businessUnitId** | **String**                          | The business unit ID of the business unit to which the forecast belongs                                                        |
| **weekDateId**     | **LocalDate**                       | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **forecastId**     | **String**                          | The ID of the forecast                                                                                                         |
| **expand**         | [**List&lt;String&gt;**](String.md) |                                                                                                                                | [optional]<br />**Values**: planningGroups, generationResults |

{: class="table-striped"}

### Return type

[**BuShortTermForecast**](BuShortTermForecast.md)

<a name="getWorkforcemanagementBusinessunitWeekShorttermforecastData"></a>

# **getWorkforcemanagementBusinessunitWeekShorttermforecastData**

> [BuForecastResultResponse](BuForecastResultResponse.md) getWorkforcemanagementBusinessunitWeekShorttermforecastData(businessUnitId, weekDateId, forecastId, weekNumber, forceDownloadService)

Get the result of a short term forecast calculation

Includes modifications unless you pass the doNotApplyModifications query parameter

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/{forecastId}/data

Requires ANY permissions:

- wfm:shortTermForecast:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
LocalDate weekDateId = new LocalDate(); // LocalDate | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String forecastId = "forecastId_example"; // String | The ID of the forecast
Integer weekNumber = 56; // Integer | The week number to fetch (for multi-week forecasts)
Boolean forceDownloadService = true; // Boolean | Force the result of this operation to be sent via download service.  For testing/app development purposes
try {
    BuForecastResultResponse result = apiInstance.getWorkforcemanagementBusinessunitWeekShorttermforecastData(businessUnitId, weekDateId, forecastId, weekNumber, forceDownloadService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekShorttermforecastData");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type          | Description                                                                                                                    | Notes      |
| ------------------------ | ------------- | ------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **businessUnitId**       | **String**    | The business unit ID of the business unit to which the forecast belongs                                                        |
| **weekDateId**           | **LocalDate** | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **forecastId**           | **String**    | The ID of the forecast                                                                                                         |
| **weekNumber**           | **Integer**   | The week number to fetch (for multi-week forecasts)                                                                            | [optional] |
| **forceDownloadService** | **Boolean**   | Force the result of this operation to be sent via download service. For testing/app development purposes                       | [optional] |

{: class="table-striped"}

### Return type

[**BuForecastResultResponse**](BuForecastResultResponse.md)

<a name="getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults"></a>

# **getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults**

> [BuForecastGenerationResult](BuForecastGenerationResult.md) getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults(businessUnitId, weekDateId, forecastId)

Gets the forecast generation results

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/{forecastId}/generationresults

Requires ANY permissions:

- wfm:shortTermForecast:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
LocalDate weekDateId = new LocalDate(); // LocalDate | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String forecastId = "forecastId_example"; // String | The ID of the forecast
try {
    BuForecastGenerationResult result = apiInstance.getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults(businessUnitId, weekDateId, forecastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type          | Description                                                                                                                    | Notes |
| ------------------ | ------------- | ------------------------------------------------------------------------------------------------------------------------------ | ----- |
| **businessUnitId** | **String**    | The business unit ID of the business unit to which the forecast belongs                                                        |
| **weekDateId**     | **LocalDate** | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **forecastId**     | **String**    | The ID of the forecast                                                                                                         |

{: class="table-striped"}

### Return type

[**BuForecastGenerationResult**](BuForecastGenerationResult.md)

<a name="getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata"></a>

# **getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata**

> [LongTermForecastResultResponse](LongTermForecastResultResponse.md) getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata(businessUnitId, weekDateId, forecastId, forceDownloadService)

Get the result of a long term forecast calculation

Includes modifications unless you pass the doNotApplyModifications query parameter

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/{forecastId}/longtermforecastdata

Requires ANY permissions:

- wfm:shortTermForecast:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
LocalDate weekDateId = new LocalDate(); // LocalDate | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String forecastId = "forecastId_example"; // String | The ID of the forecast
Boolean forceDownloadService = true; // Boolean | Force the result of this operation to be sent via download service.  For testing/app development purposes
try {
    LongTermForecastResultResponse result = apiInstance.getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata(businessUnitId, weekDateId, forecastId, forceDownloadService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type          | Description                                                                                                                    | Notes      |
| ------------------------ | ------------- | ------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **businessUnitId**       | **String**    | The business unit ID of the business unit to which the forecast belongs                                                        |
| **weekDateId**           | **LocalDate** | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **forecastId**           | **String**    | The ID of the forecast                                                                                                         |
| **forceDownloadService** | **Boolean**   | Force the result of this operation to be sent via download service. For testing/app development purposes                       | [optional] |

{: class="table-striped"}

### Return type

[**LongTermForecastResultResponse**](LongTermForecastResultResponse.md)

<a name="getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups"></a>

# **getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups**

> [ForecastPlanningGroupsResponse](ForecastPlanningGroupsResponse.md) getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups(businessUnitId, weekDateId, forecastId)

Gets the forecast planning group snapshot

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/{forecastId}/planninggroups

Requires ANY permissions:

- wfm:shortTermForecast:view
- wfm:schedule:view
- wfm:publishedSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
LocalDate weekDateId = new LocalDate(); // LocalDate | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String forecastId = "forecastId_example"; // String | The ID of the forecast
try {
    ForecastPlanningGroupsResponse result = apiInstance.getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups(businessUnitId, weekDateId, forecastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type          | Description                                                                                                                    | Notes |
| ------------------ | ------------- | ------------------------------------------------------------------------------------------------------------------------------ | ----- |
| **businessUnitId** | **String**    | The business unit ID of the business unit to which the forecast belongs                                                        |
| **weekDateId**     | **LocalDate** | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **forecastId**     | **String**    | The ID of the forecast                                                                                                         |

{: class="table-striped"}

### Return type

[**ForecastPlanningGroupsResponse**](ForecastPlanningGroupsResponse.md)

<a name="getWorkforcemanagementBusinessunitWeekShorttermforecasts"></a>

# **getWorkforcemanagementBusinessunitWeekShorttermforecasts**

> [BuShortTermForecastListing](BuShortTermForecastListing.md) getWorkforcemanagementBusinessunitWeekShorttermforecasts(businessUnitId, weekDateId)

Get short term forecasts

Use \&quot;recent\&quot; (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week

Wraps GET /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts

Requires ANY permissions:

- wfm:schedule:generate
- wfm:shortTermForecast:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
String weekDateId = "weekDateId_example"; // String | The week start date of the forecast in yyyy-MM-dd format or 'recent' (without quotes) to fetch recent forecasts
try {
    BuShortTermForecastListing result = apiInstance.getWorkforcemanagementBusinessunitWeekShorttermforecasts(businessUnitId, weekDateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitWeekShorttermforecasts");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                                                                                                             | Notes |
| ------------------ | ---------- | ----------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String** | The business unit ID of the business unit to which the forecast belongs                                                 |
| **weekDateId**     | **String** | The week start date of the forecast in yyyy-MM-dd format or &#39;recent&#39; (without quotes) to fetch recent forecasts |

{: class="table-striped"}

### Return type

[**BuShortTermForecastListing**](BuShortTermForecastListing.md)

<a name="getWorkforcemanagementBusinessunits"></a>

# **getWorkforcemanagementBusinessunits**

> [BusinessUnitListing](BusinessUnitListing.md) getWorkforcemanagementBusinessunits(feature, divisionId)

Get business units

Wraps GET /api/v2/workforcemanagement/businessunits

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String feature = "feature_example"; // String |
String divisionId = "divisionId_example"; // String |
try {
    BusinessUnitListing result = apiInstance.getWorkforcemanagementBusinessunits(feature, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunits");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| -------------- | ---------- | ----------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **feature**    | **String** |             | [optional]<br />**Values**: AgentSchedule, AgentTimeOffRequest, Coaching, CoachingDivisioned, ActivityCodes, Agents, BuActivityCodes, BusinessUnits, HistoricalAdherence, HistoricalShrinkage, IntradayMonitoring, BuIntradayMonitoring, ManagementUnits, RealTimeAdherence, Schedules, BuSchedules, ServiceGoalTemplates, PlanningGroups, ShiftTrading, ShortTermForecasts, BuShortTermForecasts, TimeOffPlans, TimeOffRequests, TimeOffLimits, WorkPlanRotations, WorkPlans |
| **divisionId** | **String** |             | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |

{: class="table-striped"}

### Return type

[**BusinessUnitListing**](BusinessUnitListing.md)

<a name="getWorkforcemanagementBusinessunitsDivisionviews"></a>

# **getWorkforcemanagementBusinessunitsDivisionviews**

> [BusinessUnitListing](BusinessUnitListing.md) getWorkforcemanagementBusinessunitsDivisionviews(divisionId)

Get business units across divisions

Wraps GET /api/v2/workforcemanagement/businessunits/divisionviews

Requires ANY permissions:

- wfm:businessUnit:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | The divisionIds to filter by. If omitted, will return business units in all divisions
try {
    BusinessUnitListing result = apiInstance.getWorkforcemanagementBusinessunitsDivisionviews(divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementBusinessunitsDivisionviews");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                                                           | Notes      |
| -------------- | ----------------------------------- | ------------------------------------------------------------------------------------- | ---------- |
| **divisionId** | [**List&lt;String&gt;**](String.md) | The divisionIds to filter by. If omitted, will return business units in all divisions | [optional] |

{: class="table-striped"}

### Return type

[**BusinessUnitListing**](BusinessUnitListing.md)

<a name="getWorkforcemanagementCalendarDataIcs"></a>

# **getWorkforcemanagementCalendarDataIcs**

> String getWorkforcemanagementCalendarDataIcs(calendarId)

Get ics formatted calendar based on shareable link

Wraps GET /api/v2/workforcemanagement/calendar/data/ics

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;


WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String calendarId = "calendarId_example"; // String | The id of the ics-formatted calendar
try {
    String result = apiInstance.getWorkforcemanagementCalendarDataIcs(calendarId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementCalendarDataIcs");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description                          | Notes |
| -------------- | ---------- | ------------------------------------ | ----- |
| **calendarId** | **String** | The id of the ics-formatted calendar |

{: class="table-striped"}

### Return type

**String**

<a name="getWorkforcemanagementCalendarUrlIcs"></a>

# **getWorkforcemanagementCalendarUrlIcs**

> [CalendarUrlResponse](CalendarUrlResponse.md) getWorkforcemanagementCalendarUrlIcs()

Get existing calendar link for the current user

Wraps GET /api/v2/workforcemanagement/calendar/url/ics

Requires ALL permissions:

- wfm:agentSchedule:sync
- wfm:agentSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
try {
    CalendarUrlResponse result = apiInstance.getWorkforcemanagementCalendarUrlIcs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementCalendarUrlIcs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**CalendarUrlResponse**](CalendarUrlResponse.md)

<a name="getWorkforcemanagementHistoricaldataDeletejob"></a>

# **getWorkforcemanagementHistoricaldataDeletejob**

> [HistoricalImportDeleteJobResponse](HistoricalImportDeleteJobResponse.md) getWorkforcemanagementHistoricaldataDeletejob()

Retrieves delete job status for historical data imports of the organization

Wraps GET /api/v2/workforcemanagement/historicaldata/deletejob

Requires ALL permissions:

- wfm:historicalData:upload

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
try {
    HistoricalImportDeleteJobResponse result = apiInstance.getWorkforcemanagementHistoricaldataDeletejob();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementHistoricaldataDeletejob");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**HistoricalImportDeleteJobResponse**](HistoricalImportDeleteJobResponse.md)

<a name="getWorkforcemanagementHistoricaldataImportstatus"></a>

# **getWorkforcemanagementHistoricaldataImportstatus**

> [HistoricalImportStatusListing](HistoricalImportStatusListing.md) getWorkforcemanagementHistoricaldataImportstatus()

Retrieves status of the historical data imports of the organization

Wraps GET /api/v2/workforcemanagement/historicaldata/importstatus

Requires ALL permissions:

- wfm:historicalData:upload

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
try {
    HistoricalImportStatusListing result = apiInstance.getWorkforcemanagementHistoricaldataImportstatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementHistoricaldataImportstatus");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**HistoricalImportStatusListing**](HistoricalImportStatusListing.md)

<a name="getWorkforcemanagementManagementunit"></a>

# **getWorkforcemanagementManagementunit**

> [ManagementUnit](ManagementUnit.md) getWorkforcemanagementManagementunit(managementUnitId, expand)

Get management unit

settings.shortTermForecasting is deprecated and now lives on the business unit

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}

Requires ANY permissions:

- wfm:activityCode:add
- wfm:activityCode:delete
- wfm:activityCode:edit
- wfm:activityCode:view
- wfm:agent:edit
- wfm:agentSchedule:view
- wfm:agentTimeOffRequest:submit
- wfm:agent:view
- wfm:businessUnit:add
- wfm:businessUnit:delete
- wfm:businessUnit:edit
- wfm:businessUnit:view
- wfm:historicalAdherence:view
- wfm:intraday:view
- wfm:managementUnit:add
- wfm:managementUnit:delete
- wfm:managementUnit:edit
- wfm:managementUnit:view
- wfm:publishedSchedule:view
- wfm:realtimeAdherence:view
- wfm:schedule:add
- wfm:schedule:delete
- wfm:schedule:edit
- wfm:schedule:generate
- wfm:schedule:view
- wfm:serviceGoalTemplate:add
- wfm:serviceGoalTemplate:delete
- wfm:serviceGoalTemplate:edit
- wfm:serviceGoalTemplate:view
- wfm:planningGroup:add
- wfm:planningGroup:delete
- wfm:planningGroup:edit
- wfm:planningGroup:view
- wfm:shiftTradeRequest:edit
- wfm:shiftTradeRequest:view
- wfm:agentShiftTradeRequest:participate
- wfm:shortTermForecast:add
- wfm:shortTermForecast:delete
- wfm:shortTermForecast:edit
- wfm:shortTermForecast:view
- wfm:timeOffLimit:add
- wfm:timeOffLimit:delete
- wfm:timeOffLimit:edit
- wfm:timeOffLimit:view
- wfm:timeOffPlan:add
- wfm:timeOffPlan:delete
- wfm:timeOffPlan:edit
- wfm:timeOffPlan:view
- wfm:timeOffRequest:add
- wfm:timeOffRequest:edit
- wfm:timeOffRequest:view
- wfm:workPlan:add
- wfm:workPlan:delete
- wfm:workPlan:edit
- wfm:workPlan:view
- wfm:workPlanRotation:add
- wfm:workPlanRotation:delete
- wfm:workPlanRotation:edit
- wfm:workPlanRotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
List<String> expand = Arrays.asList("expand_example"); // List<String> |
try {
    ManagementUnit result = apiInstance.getWorkforcemanagementManagementunit(managementUnitId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunit");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                | Description                                                                                     | Notes                                                                                                                                                 |
| -------------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| **managementUnitId** | **String**                          | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **expand**           | [**List&lt;String&gt;**](String.md) |                                                                                                 | [optional]<br />**Values**: settings, settings.adherence, settings.timeOff, settings.scheduling, settings.shortTermForecasting, settings.shiftTrading |

{: class="table-striped"}

### Return type

[**ManagementUnit**](ManagementUnit.md)

<a name="getWorkforcemanagementManagementunitActivitycodes"></a>

# **getWorkforcemanagementManagementunitActivitycodes**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [ActivityCodeContainer](ActivityCodeContainer.md) getWorkforcemanagementManagementunitActivitycodes(managementUnitId)

Get activity codes

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/activitycodes

Requires ANY permissions:

- wfm:activityCode:add
- wfm:activityCode:delete
- wfm:activityCode:edit
- wfm:activityCode:view
- wfm:agent:edit
- wfm:agentSchedule:view
- wfm:agentTimeOffRequest:submit
- wfm:agent:view
- wfm:businessUnit:add
- wfm:businessUnit:delete
- wfm:businessUnit:edit
- wfm:businessUnit:view
- wfm:historicalAdherence:view
- wfm:intraday:view
- wfm:managementUnit:add
- wfm:managementUnit:delete
- wfm:managementUnit:edit
- wfm:managementUnit:view
- wfm:publishedSchedule:view
- wfm:realtimeAdherence:view
- wfm:schedule:add
- wfm:schedule:delete
- wfm:schedule:edit
- wfm:schedule:generate
- wfm:schedule:view
- wfm:shortTermForecast:add
- wfm:shortTermForecast:delete
- wfm:shortTermForecast:edit
- wfm:shortTermForecast:view
- wfm:timeOffRequest:add
- wfm:timeOffRequest:edit
- wfm:timeOffRequest:view
- wfm:workPlan:add
- wfm:workPlan:delete
- wfm:workPlan:edit
- wfm:workPlan:view
- wfm:workPlanRotation:add
- wfm:workPlanRotation:delete
- wfm:workPlanRotation:edit
- wfm:workPlanRotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
try {
    ActivityCodeContainer result = apiInstance.getWorkforcemanagementManagementunitActivitycodes(managementUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitActivitycodes");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                                                                     | Notes |
| -------------------- | ---------- | ----------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId** | **String** | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |

{: class="table-striped"}

### Return type

[**ActivityCodeContainer**](ActivityCodeContainer.md)

<a name="getWorkforcemanagementManagementunitAdherence"></a>

# **getWorkforcemanagementManagementunitAdherence**

> [UserScheduleAdherenceListing](UserScheduleAdherenceListing.md) getWorkforcemanagementManagementunitAdherence(managementUnitId, forceDownloadService)

Get a list of user schedule adherence records for the requested management unit

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/adherence

Requires ANY permissions:

- wfm:realtimeAdherence:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit.
Boolean forceDownloadService = true; // Boolean | Force the result of this operation to be sent via download service.  For testing/app development purposes
try {
    UserScheduleAdherenceListing result = apiInstance.getWorkforcemanagementManagementunitAdherence(managementUnitId, forceDownloadService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitAdherence");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type        | Description                                                                                              | Notes      |
| ------------------------ | ----------- | -------------------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId**     | **String**  | The management unit ID of the management unit.                                                           |
| **forceDownloadService** | **Boolean** | Force the result of this operation to be sent via download service. For testing/app development purposes | [optional] |

{: class="table-striped"}

### Return type

[**UserScheduleAdherenceListing**](UserScheduleAdherenceListing.md)

<a name="getWorkforcemanagementManagementunitAgent"></a>

# **getWorkforcemanagementManagementunitAgent**

> [WfmAgent](WfmAgent.md) getWorkforcemanagementManagementunitAgent(managementUnitId, agentId, excludeCapabilities)

Get data for agent in the management unit

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/agents/{agentId}

Requires ANY permissions:

- wfm:agent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The id of the management unit, or 'mine' for the management unit of the logged-in user.
String agentId = "agentId_example"; // String | The agent id
Boolean excludeCapabilities = true; // Boolean | Excludes all capabilities of the agent such as queues, languages, and skills
try {
    WfmAgent result = apiInstance.getWorkforcemanagementManagementunitAgent(managementUnitId, agentId, excludeCapabilities);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitAgent");
    e.printStackTrace();
}
```

### Parameters

| Name                    | Type        | Description                                                                                     | Notes      |
| ----------------------- | ----------- | ----------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId**    | **String**  | The id of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **agentId**             | **String**  | The agent id                                                                                    |
| **excludeCapabilities** | **Boolean** | Excludes all capabilities of the agent such as queues, languages, and skills                    | [optional] |

{: class="table-striped"}

### Return type

[**WfmAgent**](WfmAgent.md)

<a name="getWorkforcemanagementManagementunitAgentShifttrades"></a>

# **getWorkforcemanagementManagementunitAgentShifttrades**

> [ShiftTradeListResponse](ShiftTradeListResponse.md) getWorkforcemanagementManagementunitAgentShifttrades(managementUnitId, agentId)

Gets all the shift trades for a given agent

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/agents/{agentId}/shifttrades

Requires ANY permissions:

- wfm:shiftTradeRequest:edit
- wfm:shiftTradeRequest:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The id of the management unit, or 'mine' for the management unit of the logged-in user.
String agentId = "agentId_example"; // String | The agent id
try {
    ShiftTradeListResponse result = apiInstance.getWorkforcemanagementManagementunitAgentShifttrades(managementUnitId, agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitAgentShifttrades");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                                                                     | Notes |
| -------------------- | ---------- | ----------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId** | **String** | The id of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **agentId**          | **String** | The agent id                                                                                    |

{: class="table-striped"}

### Return type

[**ShiftTradeListResponse**](ShiftTradeListResponse.md)

<a name="getWorkforcemanagementManagementunitShifttradesMatched"></a>

# **getWorkforcemanagementManagementunitShifttradesMatched**

> [ShiftTradeMatchesSummaryResponse](ShiftTradeMatchesSummaryResponse.md) getWorkforcemanagementManagementunitShifttradesMatched(managementUnitId)

Gets a summary of all shift trades in the matched state

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/shifttrades/matched

Requires ANY permissions:

- wfm:shiftTradeRequest:view
- wfm:shiftTradeRequest:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
try {
    ShiftTradeMatchesSummaryResponse result = apiInstance.getWorkforcemanagementManagementunitShifttradesMatched(managementUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitShifttradesMatched");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                                                                                     | Notes |
| -------------------- | ---------- | --------------------------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId** | **String** | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |

{: class="table-striped"}

### Return type

[**ShiftTradeMatchesSummaryResponse**](ShiftTradeMatchesSummaryResponse.md)

<a name="getWorkforcemanagementManagementunitShifttradesUsers"></a>

# **getWorkforcemanagementManagementunitShifttradesUsers**

> [WfmUserEntityListing](WfmUserEntityListing.md) getWorkforcemanagementManagementunitShifttradesUsers(managementUnitId)

Gets list of users available for whom you can send direct shift trade requests

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/shifttrades/users

Requires ANY permissions:

- wfm:agentShiftTradeRequest:participate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
try {
    WfmUserEntityListing result = apiInstance.getWorkforcemanagementManagementunitShifttradesUsers(managementUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitShifttradesUsers");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                                                                                     | Notes |
| -------------------- | ---------- | --------------------------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId** | **String** | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |

{: class="table-striped"}

### Return type

[**WfmUserEntityListing**](WfmUserEntityListing.md)

<a name="getWorkforcemanagementManagementunitTimeofflimit"></a>

# **getWorkforcemanagementManagementunitTimeofflimit**

> [TimeOffLimit](TimeOffLimit.md) getWorkforcemanagementManagementunitTimeofflimit(managementUnitId, timeOffLimitId)

Gets a time off limit object

Returns properties of time off limit object, but not daily values.

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeofflimits/{timeOffLimitId}

Requires ANY permissions:

- wfm:timeOffLimit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit.
String timeOffLimitId = "timeOffLimitId_example"; // String | The ID of the time off limit to fetch
try {
    TimeOffLimit result = apiInstance.getWorkforcemanagementManagementunitTimeofflimit(managementUnitId, timeOffLimitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitTimeofflimit");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                    | Notes |
| -------------------- | ---------- | ---------------------------------------------- | ----- |
| **managementUnitId** | **String** | The management unit ID of the management unit. |
| **timeOffLimitId**   | **String** | The ID of the time off limit to fetch          |

{: class="table-striped"}

### Return type

[**TimeOffLimit**](TimeOffLimit.md)

<a name="getWorkforcemanagementManagementunitTimeofflimits"></a>

# **getWorkforcemanagementManagementunitTimeofflimits**

> [TimeOffLimitListing](TimeOffLimitListing.md) getWorkforcemanagementManagementunitTimeofflimits(managementUnitId)

Gets a list of time off limit objects under management unit.

Currently only one time off limit object is allowed under management unit, so the list contains either 0 or 1 element.

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeofflimits

Requires ANY permissions:

- wfm:timeOffLimit:view
- wfm:timeOffPlan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit.
try {
    TimeOffLimitListing result = apiInstance.getWorkforcemanagementManagementunitTimeofflimits(managementUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitTimeofflimits");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                    | Notes |
| -------------------- | ---------- | ---------------------------------------------- | ----- |
| **managementUnitId** | **String** | The management unit ID of the management unit. |

{: class="table-striped"}

### Return type

[**TimeOffLimitListing**](TimeOffLimitListing.md)

<a name="getWorkforcemanagementManagementunitTimeoffplan"></a>

# **getWorkforcemanagementManagementunitTimeoffplan**

> [TimeOffPlan](TimeOffPlan.md) getWorkforcemanagementManagementunitTimeoffplan(managementUnitId, timeOffPlanId)

Gets a time off plan

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeoffplans/{timeOffPlanId}

Requires ANY permissions:

- wfm:timeOffPlan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID.
String timeOffPlanId = "timeOffPlanId_example"; // String | The ID of the time off plan to fetch
try {
    TimeOffPlan result = apiInstance.getWorkforcemanagementManagementunitTimeoffplan(managementUnitId, timeOffPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitTimeoffplan");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                          | Notes |
| -------------------- | ---------- | ------------------------------------ | ----- |
| **managementUnitId** | **String** | The management unit ID.              |
| **timeOffPlanId**    | **String** | The ID of the time off plan to fetch |

{: class="table-striped"}

### Return type

[**TimeOffPlan**](TimeOffPlan.md)

<a name="getWorkforcemanagementManagementunitTimeoffplans"></a>

# **getWorkforcemanagementManagementunitTimeoffplans**

> [TimeOffPlanListing](TimeOffPlanListing.md) getWorkforcemanagementManagementunitTimeoffplans(managementUnitId)

Gets a list of time off plans

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeoffplans

Requires ANY permissions:

- wfm:timeOffPlan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID.
try {
    TimeOffPlanListing result = apiInstance.getWorkforcemanagementManagementunitTimeoffplans(managementUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitTimeoffplans");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description             | Notes |
| -------------------- | ---------- | ----------------------- | ----- |
| **managementUnitId** | **String** | The management unit ID. |

{: class="table-striped"}

### Return type

[**TimeOffPlanListing**](TimeOffPlanListing.md)

<a name="getWorkforcemanagementManagementunitUserTimeoffrequest"></a>

# **getWorkforcemanagementManagementunitUserTimeoffrequest**

> [TimeOffRequestResponse](TimeOffRequestResponse.md) getWorkforcemanagementManagementunitUserTimeoffrequest(managementUnitId, userId, timeOffRequestId)

Get a time off request

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/users/{userId}/timeoffrequests/{timeOffRequestId}

Requires ANY permissions:

- wfm:timeOffRequest:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
String userId = "userId_example"; // String | The userId to whom the Time Off Request applies.
String timeOffRequestId = "timeOffRequestId_example"; // String | Time Off Request Id
try {
    TimeOffRequestResponse result = apiInstance.getWorkforcemanagementManagementunitUserTimeoffrequest(managementUnitId, userId, timeOffRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitUserTimeoffrequest");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                                                                       | Notes |
| -------------------- | ---------- | ------------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId** | **String** | The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **userId**           | **String** | The userId to whom the Time Off Request applies.                                                  |
| **timeOffRequestId** | **String** | Time Off Request Id                                                                               |

{: class="table-striped"}

### Return type

[**TimeOffRequestResponse**](TimeOffRequestResponse.md)

<a name="getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits"></a>

# **getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits**

> [QueryTimeOffLimitValuesResponse](QueryTimeOffLimitValuesResponse.md) getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits(managementUnitId, userId, timeOffRequestId)

Retrieves time off limit, allocated and waitlisted values according to specific time off request

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/users/{userId}/timeoffrequests/{timeOffRequestId}/timeofflimits

Requires ALL permissions:

- wfm:timeOffRequest:view
- wfm:timeOffLimit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit.
String userId = "userId_example"; // String | The userId to whom the time off request applies.
String timeOffRequestId = "timeOffRequestId_example"; // String | The ID of the time off request, which dates and activityCodeId determine limit values to retrieve
try {
    QueryTimeOffLimitValuesResponse result = apiInstance.getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits(managementUnitId, userId, timeOffRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                                                                       | Notes |
| -------------------- | ---------- | ------------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId** | **String** | The management unit ID of the management unit.                                                    |
| **userId**           | **String** | The userId to whom the time off request applies.                                                  |
| **timeOffRequestId** | **String** | The ID of the time off request, which dates and activityCodeId determine limit values to retrieve |

{: class="table-striped"}

### Return type

[**QueryTimeOffLimitValuesResponse**](QueryTimeOffLimitValuesResponse.md)

<a name="getWorkforcemanagementManagementunitUserTimeoffrequests"></a>

# **getWorkforcemanagementManagementunitUserTimeoffrequests**

> [TimeOffRequestList](TimeOffRequestList.md) getWorkforcemanagementManagementunitUserTimeoffrequests(managementUnitId, userId, recentlyReviewed)

Get a list of time off requests for a given user

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/users/{userId}/timeoffrequests

Requires ANY permissions:

- wfm:timeOffRequest:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
String userId = "userId_example"; // String | The userId to whom the Time Off Request applies.
Boolean recentlyReviewed = false; // Boolean | Limit results to requests that have been reviewed within the preceding 30 days
try {
    TimeOffRequestList result = apiInstance.getWorkforcemanagementManagementunitUserTimeoffrequests(managementUnitId, userId, recentlyReviewed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitUserTimeoffrequests");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type        | Description                                                                                       | Notes                         |
| -------------------- | ----------- | ------------------------------------------------------------------------------------------------- | ----------------------------- |
| **managementUnitId** | **String**  | The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **userId**           | **String**  | The userId to whom the Time Off Request applies.                                                  |
| **recentlyReviewed** | **Boolean** | Limit results to requests that have been reviewed within the preceding 30 days                    | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**TimeOffRequestList**](TimeOffRequestList.md)

<a name="getWorkforcemanagementManagementunitUsers"></a>

# **getWorkforcemanagementManagementunitUsers**

> [WfmUserEntityListing](WfmUserEntityListing.md) getWorkforcemanagementManagementunitUsers(managementUnitId)

Get users in the management unit

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/users

Requires ANY permissions:

- wfm:agent:view
- wfm:historicalAdherence:view
- wfm:publishedSchedule:view
- wfm:realtimeAdherence:view
- wfm:schedule:view
- wfm:timeOffRequest:view
- wfm:workPlanRotation:view
- wfm:workPlan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
try {
    WfmUserEntityListing result = apiInstance.getWorkforcemanagementManagementunitUsers(managementUnitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitUsers");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description                                                                                                     | Notes |
| -------------------- | ---------- | --------------------------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId** | **String** | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |

{: class="table-striped"}

### Return type

[**WfmUserEntityListing**](WfmUserEntityListing.md)

<a name="getWorkforcemanagementManagementunitWeekSchedule"></a>

# **getWorkforcemanagementManagementunitWeekSchedule**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [WeekScheduleResponse](WeekScheduleResponse.md) getWorkforcemanagementManagementunitWeekSchedule(managementUnitId, weekId, scheduleId, expand, forceDownloadService)

Deprecated. Use the equivalent business unit resource instead. Get a week schedule

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/weeks/{weekId}/schedules/{scheduleId}

Requires ANY permissions:

- wfm:publishedSchedule:view
- wfm:schedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String weekId = "weekId_example"; // String | First day of schedule week in yyyy-MM-dd format.
String scheduleId = "scheduleId_example"; // String | The ID of the schedule to fetch
String expand = "expand_example"; // String | Which fields, if any, to expand
Boolean forceDownloadService = true; // Boolean | Force the result of this operation to be sent via download service.  For testing/app development purposes
try {
    WeekScheduleResponse result = apiInstance.getWorkforcemanagementManagementunitWeekSchedule(managementUnitId, weekId, scheduleId, expand, forceDownloadService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitWeekSchedule");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type        | Description                                                                                              | Notes                                                            |
| ------------------------ | ----------- | -------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------- |
| **managementUnitId**     | **String**  | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user.          |
| **weekId**               | **String**  | First day of schedule week in yyyy-MM-dd format.                                                         |
| **scheduleId**           | **String**  | The ID of the schedule to fetch                                                                          |
| **expand**               | **String**  | Which fields, if any, to expand                                                                          | [optional]<br />**Values**: generationResults, headcountForecast |
| **forceDownloadService** | **Boolean** | Force the result of this operation to be sent via download service. For testing/app development purposes | [optional]                                                       |

{: class="table-striped"}

### Return type

[**WeekScheduleResponse**](WeekScheduleResponse.md)

<a name="getWorkforcemanagementManagementunitWeekSchedules"></a>

# **getWorkforcemanagementManagementunitWeekSchedules**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [WeekScheduleListResponse](WeekScheduleListResponse.md) getWorkforcemanagementManagementunitWeekSchedules(managementUnitId, weekId, includeOnlyPublished, earliestWeekDate, latestWeekDate)

Deprecated. Use the equivalent business unit resource instead. Get the list of schedules in a week in management unit

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/weeks/{weekId}/schedules

Requires ANY permissions:

- wfm:publishedSchedule:view
- wfm:schedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String weekId = "weekId_example"; // String | First day of schedule week in yyyy-MM-dd format.
Boolean includeOnlyPublished = true; // Boolean | Return only published schedules
String earliestWeekDate = "earliestWeekDate_example"; // String | The start date of the earliest week to query in yyyy-MM-dd format
String latestWeekDate = "latestWeekDate_example"; // String | The start date of the latest week to query in yyyy-MM-dd format
try {
    WeekScheduleListResponse result = apiInstance.getWorkforcemanagementManagementunitWeekSchedules(managementUnitId, weekId, includeOnlyPublished, earliestWeekDate, latestWeekDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitWeekSchedules");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type        | Description                                                                                     | Notes      |
| ------------------------ | ----------- | ----------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId**     | **String**  | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **weekId**               | **String**  | First day of schedule week in yyyy-MM-dd format.                                                |
| **includeOnlyPublished** | **Boolean** | Return only published schedules                                                                 | [optional] |
| **earliestWeekDate**     | **String**  | The start date of the earliest week to query in yyyy-MM-dd format                               | [optional] |
| **latestWeekDate**       | **String**  | The start date of the latest week to query in yyyy-MM-dd format                                 | [optional] |

{: class="table-striped"}

### Return type

[**WeekScheduleListResponse**](WeekScheduleListResponse.md)

<a name="getWorkforcemanagementManagementunitWeekShifttrades"></a>

# **getWorkforcemanagementManagementunitWeekShifttrades**

> [WeekShiftTradeListResponse](WeekShiftTradeListResponse.md) getWorkforcemanagementManagementunitWeekShifttrades(managementUnitId, weekDateId, evaluateMatches)

Gets all the shift trades for a given week

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/weeks/{weekDateId}/shifttrades

Requires ANY permissions:

- wfm:shiftTradeRequest:view
- wfm:shiftTradeRequest:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
LocalDate weekDateId = new LocalDate(); // LocalDate | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
Boolean evaluateMatches = true; // Boolean | Whether to evaluate the matches for violations
try {
    WeekShiftTradeListResponse result = apiInstance.getWorkforcemanagementManagementunitWeekShifttrades(managementUnitId, weekDateId, evaluateMatches);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitWeekShifttrades");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type          | Description                                                                                                                    | Notes                        |
| -------------------- | ------------- | ------------------------------------------------------------------------------------------------------------------------------ | ---------------------------- |
| **managementUnitId** | **String**    | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user.                |
| **weekDateId**       | **LocalDate** | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **evaluateMatches**  | **Boolean**   | Whether to evaluate the matches for violations                                                                                 | [optional] [default to true] |

{: class="table-striped"}

### Return type

[**WeekShiftTradeListResponse**](WeekShiftTradeListResponse.md)

<a name="getWorkforcemanagementManagementunitWorkplan"></a>

# **getWorkforcemanagementManagementunitWorkplan**

> [WorkPlan](WorkPlan.md) getWorkforcemanagementManagementunitWorkplan(managementUnitId, workPlanId, includeOnly)

Get a work plan

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplans/{workPlanId}

Requires ANY permissions:

- wfm:workPlanRotation:view
- wfm:workPlan:view
- wfm:schedule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String workPlanId = "workPlanId_example"; // String | The ID of the work plan to fetch
List<String> includeOnly = Arrays.asList("includeOnly_example"); // List<String> | limit response to the specified fields
try {
    WorkPlan result = apiInstance.getWorkforcemanagementManagementunitWorkplan(managementUnitId, workPlanId, includeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitWorkplan");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                | Description                                                                                     | Notes                                                                                     |
| -------------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| **managementUnitId** | **String**                          | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **workPlanId**       | **String**                          | The ID of the work plan to fetch                                                                |
| **includeOnly**      | [**List&lt;String&gt;**](String.md) | limit response to the specified fields                                                          | [optional]<br />**Values**: agentCount, agents, optionalDays, shifts, shiftStartVariances |

{: class="table-striped"}

### Return type

[**WorkPlan**](WorkPlan.md)

<a name="getWorkforcemanagementManagementunitWorkplanrotation"></a>

# **getWorkforcemanagementManagementunitWorkplanrotation**

> [WorkPlanRotationResponse](WorkPlanRotationResponse.md) getWorkforcemanagementManagementunitWorkplanrotation(managementUnitId, workPlanRotationId)

Get a work plan rotation

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplanrotations/{workPlanRotationId}

Requires ANY permissions:

- wfm:workPlanRotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String workPlanRotationId = "workPlanRotationId_example"; // String | The ID of the work plan rotation to fetch
try {
    WorkPlanRotationResponse result = apiInstance.getWorkforcemanagementManagementunitWorkplanrotation(managementUnitId, workPlanRotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitWorkplanrotation");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type       | Description                                                                                     | Notes |
| ---------------------- | ---------- | ----------------------------------------------------------------------------------------------- | ----- |
| **managementUnitId**   | **String** | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **workPlanRotationId** | **String** | The ID of the work plan rotation to fetch                                                       |

{: class="table-striped"}

### Return type

[**WorkPlanRotationResponse**](WorkPlanRotationResponse.md)

<a name="getWorkforcemanagementManagementunitWorkplanrotations"></a>

# **getWorkforcemanagementManagementunitWorkplanrotations**

> [WorkPlanRotationListResponse](WorkPlanRotationListResponse.md) getWorkforcemanagementManagementunitWorkplanrotations(managementUnitId, expand)

Get work plan rotations

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplanrotations

Requires ANY permissions:

- wfm:agent:view
- wfm:workPlanRotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
List<String> expand = Arrays.asList("expand_example"); // List<String> |
try {
    WorkPlanRotationListResponse result = apiInstance.getWorkforcemanagementManagementunitWorkplanrotations(managementUnitId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitWorkplanrotations");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                | Description                                                                                     | Notes                              |
| -------------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------- | ---------------------------------- |
| **managementUnitId** | **String**                          | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **expand**           | [**List&lt;String&gt;**](String.md) |                                                                                                 | [optional]<br />**Values**: agents |

{: class="table-striped"}

### Return type

[**WorkPlanRotationListResponse**](WorkPlanRotationListResponse.md)

<a name="getWorkforcemanagementManagementunitWorkplans"></a>

# **getWorkforcemanagementManagementunitWorkplans**

> [WorkPlanListResponse](WorkPlanListResponse.md) getWorkforcemanagementManagementunitWorkplans(managementUnitId, expand)

Get work plans

\&quot;expand=details\&quot; is deprecated

Wraps GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplans

Requires ANY permissions:

- wfm:agent:view
- wfm:publishedSchedule:view
- wfm:schedule:view
- wfm:workPlanRotation:view
- wfm:workPlan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
List<String> expand = Arrays.asList("expand_example"); // List<String> |
try {
    WorkPlanListResponse result = apiInstance.getWorkforcemanagementManagementunitWorkplans(managementUnitId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitWorkplans");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                | Description                                                                                     | Notes                                                                                              |
| -------------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| **managementUnitId** | **String**                          | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **expand**           | [**List&lt;String&gt;**](String.md) |                                                                                                 | [optional]<br />**Values**: agentCount, agents, optionalDays, shifts, shiftStartVariances, details |

{: class="table-striped"}

### Return type

[**WorkPlanListResponse**](WorkPlanListResponse.md)

<a name="getWorkforcemanagementManagementunits"></a>

# **getWorkforcemanagementManagementunits**

> [ManagementUnitListing](ManagementUnitListing.md) getWorkforcemanagementManagementunits(pageSize, pageNumber, expand, feature, divisionId)

Get management units

Wraps GET /api/v2/workforcemanagement/managementunits

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
Integer pageSize = 56; // Integer | Deprecated, paging is not supported
Integer pageNumber = 56; // Integer | Deprecated, paging is not supported
String expand = "expand_example"; // String | Deprecated, expand settings on the single MU route
String feature = "feature_example"; // String |
String divisionId = "divisionId_example"; // String |
try {
    ManagementUnitListing result = apiInstance.getWorkforcemanagementManagementunits(pageSize, pageNumber, expand, feature, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunits");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                                        | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| -------------- | ----------- | -------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **pageSize**   | **Integer** | Deprecated, paging is not supported                | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| **pageNumber** | **Integer** | Deprecated, paging is not supported                | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| **expand**     | **String**  | Deprecated, expand settings on the single MU route | [optional]<br />**Values**: details                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| **feature**    | **String**  |                                                    | [optional]<br />**Values**: AgentSchedule, AgentTimeOffRequest, Coaching, CoachingDivisioned, ActivityCodes, Agents, BuActivityCodes, BusinessUnits, HistoricalAdherence, HistoricalShrinkage, IntradayMonitoring, BuIntradayMonitoring, ManagementUnits, RealTimeAdherence, Schedules, BuSchedules, ServiceGoalTemplates, PlanningGroups, ShiftTrading, ShortTermForecasts, BuShortTermForecasts, TimeOffPlans, TimeOffRequests, TimeOffLimits, WorkPlanRotations, WorkPlans |
| **divisionId** | **String**  |                                                    | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |

{: class="table-striped"}

### Return type

[**ManagementUnitListing**](ManagementUnitListing.md)

<a name="getWorkforcemanagementManagementunitsDivisionviews"></a>

# **getWorkforcemanagementManagementunitsDivisionviews**

> [ManagementUnitListing](ManagementUnitListing.md) getWorkforcemanagementManagementunitsDivisionviews(divisionId)

Get management units across divisions

Wraps GET /api/v2/workforcemanagement/managementunits/divisionviews

Requires ANY permissions:

- wfm:managementUnit:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | The divisionIds to filter by. If omitted, will return all divisions
try {
    ManagementUnitListing result = apiInstance.getWorkforcemanagementManagementunitsDivisionviews(divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementManagementunitsDivisionviews");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                                         | Notes      |
| -------------- | ----------------------------------- | ------------------------------------------------------------------- | ---------- |
| **divisionId** | [**List&lt;String&gt;**](String.md) | The divisionIds to filter by. If omitted, will return all divisions | [optional] |

{: class="table-striped"}

### Return type

[**ManagementUnitListing**](ManagementUnitListing.md)

<a name="getWorkforcemanagementNotifications"></a>

# **getWorkforcemanagementNotifications**

> [NotificationsResponse](NotificationsResponse.md) getWorkforcemanagementNotifications()

Get a list of notifications for the current user

Notifications are only initially sent if you have the relevant Notify and Edit permissions

Wraps GET /api/v2/workforcemanagement/notifications

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
try {
    NotificationsResponse result = apiInstance.getWorkforcemanagementNotifications();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementNotifications");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**NotificationsResponse**](NotificationsResponse.md)

<a name="getWorkforcemanagementSchedulingjob"></a>

# **getWorkforcemanagementSchedulingjob**

> [SchedulingStatusResponse](SchedulingStatusResponse.md) getWorkforcemanagementSchedulingjob(jobId)

Get status of the scheduling job

Wraps GET /api/v2/workforcemanagement/schedulingjobs/{jobId}

Requires ANY permissions:

- wfm:schedulingrequest:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String jobId = "jobId_example"; // String | The id of the scheduling job
try {
    SchedulingStatusResponse result = apiInstance.getWorkforcemanagementSchedulingjob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementSchedulingjob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description                  | Notes |
| --------- | ---------- | ---------------------------- | ----- |
| **jobId** | **String** | The id of the scheduling job |

{: class="table-striped"}

### Return type

[**SchedulingStatusResponse**](SchedulingStatusResponse.md)

<a name="getWorkforcemanagementShifttrades"></a>

# **getWorkforcemanagementShifttrades**

> [ShiftTradeListResponse](ShiftTradeListResponse.md) getWorkforcemanagementShifttrades()

Gets all of my shift trades

Wraps GET /api/v2/workforcemanagement/shifttrades

Requires ANY permissions:

- wfm:shiftTradeRequest:edit
- wfm:shiftTradeRequest:view
- wfm:agentShiftTradeRequest:participate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
try {
    ShiftTradeListResponse result = apiInstance.getWorkforcemanagementShifttrades();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementShifttrades");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**ShiftTradeListResponse**](ShiftTradeListResponse.md)

<a name="getWorkforcemanagementTimeoffrequest"></a>

# **getWorkforcemanagementTimeoffrequest**

> [TimeOffRequestResponse](TimeOffRequestResponse.md) getWorkforcemanagementTimeoffrequest(timeOffRequestId)

Get a time off request for the current user

Wraps GET /api/v2/workforcemanagement/timeoffrequests/{timeOffRequestId}

Requires ANY permissions:

- wfm:agentSchedule:view
- wfm:agentTimeOffRequest:submit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String timeOffRequestId = "timeOffRequestId_example"; // String | Time Off Request Id
try {
    TimeOffRequestResponse result = apiInstance.getWorkforcemanagementTimeoffrequest(timeOffRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementTimeoffrequest");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description         | Notes |
| -------------------- | ---------- | ------------------- | ----- |
| **timeOffRequestId** | **String** | Time Off Request Id |

{: class="table-striped"}

### Return type

[**TimeOffRequestResponse**](TimeOffRequestResponse.md)

<a name="getWorkforcemanagementTimeoffrequestWaitlistpositions"></a>

# **getWorkforcemanagementTimeoffrequestWaitlistpositions**

> [WaitlistPositionListing](WaitlistPositionListing.md) getWorkforcemanagementTimeoffrequestWaitlistpositions(timeOffRequestId)

Get the daily waitlist positions of a time off request for the current user

Wraps GET /api/v2/workforcemanagement/timeoffrequests/{timeOffRequestId}/waitlistpositions

Requires ANY permissions:

- wfm:agentTimeOffRequest:submit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String timeOffRequestId = "timeOffRequestId_example"; // String | Time Off Request Id
try {
    WaitlistPositionListing result = apiInstance.getWorkforcemanagementTimeoffrequestWaitlistpositions(timeOffRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementTimeoffrequestWaitlistpositions");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description         | Notes |
| -------------------- | ---------- | ------------------- | ----- |
| **timeOffRequestId** | **String** | Time Off Request Id |

{: class="table-striped"}

### Return type

[**WaitlistPositionListing**](WaitlistPositionListing.md)

<a name="getWorkforcemanagementTimeoffrequests"></a>

# **getWorkforcemanagementTimeoffrequests**

> [TimeOffRequestList](TimeOffRequestList.md) getWorkforcemanagementTimeoffrequests(recentlyReviewed)

Get a list of time off requests for the current user

Wraps GET /api/v2/workforcemanagement/timeoffrequests

Requires ANY permissions:

- wfm:agentSchedule:view
- wfm:agentTimeOffRequest:submit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
Boolean recentlyReviewed = false; // Boolean | Limit results to requests that have been reviewed within the preceding 30 days
try {
    TimeOffRequestList result = apiInstance.getWorkforcemanagementTimeoffrequests(recentlyReviewed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#getWorkforcemanagementTimeoffrequests");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type        | Description                                                                    | Notes                         |
| -------------------- | ----------- | ------------------------------------------------------------------------------ | ----------------------------- |
| **recentlyReviewed** | **Boolean** | Limit results to requests that have been reviewed within the preceding 30 days | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**TimeOffRequestList**](TimeOffRequestList.md)

<a name="patchWorkforcemanagementBusinessunit"></a>

# **patchWorkforcemanagementBusinessunit**

> [BusinessUnit](BusinessUnit.md) patchWorkforcemanagementBusinessunit(businessUnitId, body)

Update business unit

Wraps PATCH /api/v2/workforcemanagement/businessunits/{businessUnitId}

Requires ALL permissions:

- wfm:businessUnit:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit, or 'mine' for the business unit of the logged-in user.
UpdateBusinessUnitRequest body = new UpdateBusinessUnitRequest(); // UpdateBusinessUnitRequest | body
try {
    BusinessUnit result = apiInstance.patchWorkforcemanagementBusinessunit(businessUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementBusinessunit");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                          | Description                                                                                 | Notes      |
| ------------------ | ------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ---------- |
| **businessUnitId** | **String**                                                    | The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. |
| **body**           | [**UpdateBusinessUnitRequest**](UpdateBusinessUnitRequest.md) | body                                                                                        | [optional] |

{: class="table-striped"}

### Return type

[**BusinessUnit**](BusinessUnit.md)

<a name="patchWorkforcemanagementBusinessunitActivitycode"></a>

# **patchWorkforcemanagementBusinessunitActivitycode**

> [BusinessUnitActivityCode](BusinessUnitActivityCode.md) patchWorkforcemanagementBusinessunitActivitycode(businessUnitId, activityCodeId, body)

Update an activity code

Wraps PATCH /api/v2/workforcemanagement/businessunits/{businessUnitId}/activitycodes/{activityCodeId}

Requires ANY permissions:

- wfm:activityCode:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit, or 'mine' for the business unit of the logged-in user.
String activityCodeId = "activityCodeId_example"; // String | The ID of the activity code to update
UpdateActivityCodeRequest body = new UpdateActivityCodeRequest(); // UpdateActivityCodeRequest | body
try {
    BusinessUnitActivityCode result = apiInstance.patchWorkforcemanagementBusinessunitActivitycode(businessUnitId, activityCodeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementBusinessunitActivitycode");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                          | Description                                                                                 | Notes      |
| ------------------ | ------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ---------- |
| **businessUnitId** | **String**                                                    | The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. |
| **activityCodeId** | **String**                                                    | The ID of the activity code to update                                                       |
| **body**           | [**UpdateActivityCodeRequest**](UpdateActivityCodeRequest.md) | body                                                                                        | [optional] |

{: class="table-striped"}

### Return type

[**BusinessUnitActivityCode**](BusinessUnitActivityCode.md)

<a name="patchWorkforcemanagementBusinessunitPlanninggroup"></a>

# **patchWorkforcemanagementBusinessunitPlanninggroup**

> [PlanningGroup](PlanningGroup.md) patchWorkforcemanagementBusinessunitPlanninggroup(businessUnitId, planningGroupId, body)

Updates the planning group

Wraps PATCH /api/v2/workforcemanagement/businessunits/{businessUnitId}/planninggroups/{planningGroupId}

Requires ANY permissions:

- wfm:planningGroup:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit.
String planningGroupId = "planningGroupId_example"; // String | The ID of a planning group to update
UpdatePlanningGroupRequest body = new UpdatePlanningGroupRequest(); // UpdatePlanningGroupRequest | body
try {
    PlanningGroup result = apiInstance.patchWorkforcemanagementBusinessunitPlanninggroup(businessUnitId, planningGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementBusinessunitPlanninggroup");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                            | Description                          | Notes      |
| ------------------- | --------------------------------------------------------------- | ------------------------------------ | ---------- |
| **businessUnitId**  | **String**                                                      | The ID of the business unit.         |
| **planningGroupId** | **String**                                                      | The ID of a planning group to update |
| **body**            | [**UpdatePlanningGroupRequest**](UpdatePlanningGroupRequest.md) | body                                 | [optional] |

{: class="table-striped"}

### Return type

[**PlanningGroup**](PlanningGroup.md)

<a name="patchWorkforcemanagementBusinessunitSchedulingRun"></a>

# **patchWorkforcemanagementBusinessunitSchedulingRun**

> Void patchWorkforcemanagementBusinessunitSchedulingRun(businessUnitId, runId, body)

Mark a schedule run as applied

Wraps PATCH /api/v2/workforcemanagement/businessunits/{businessUnitId}/scheduling/runs/{runId}

Requires ANY permissions:

- wfm:schedule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
String runId = "runId_example"; // String | The ID of the schedule run
PatchBuScheduleRunRequest body = new PatchBuScheduleRunRequest(); // PatchBuScheduleRunRequest | body
try {
    apiInstance.patchWorkforcemanagementBusinessunitSchedulingRun(businessUnitId, runId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementBusinessunitSchedulingRun");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                          | Description                 | Notes      |
| ------------------ | ------------------------------------------------------------- | --------------------------- | ---------- |
| **businessUnitId** | **String**                                                    | The ID of the business unit |
| **runId**          | **String**                                                    | The ID of the schedule run  |
| **body**           | [**PatchBuScheduleRunRequest**](PatchBuScheduleRunRequest.md) | body                        | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchWorkforcemanagementBusinessunitServicegoaltemplate"></a>

# **patchWorkforcemanagementBusinessunitServicegoaltemplate**

> [ServiceGoalTemplate](ServiceGoalTemplate.md) patchWorkforcemanagementBusinessunitServicegoaltemplate(businessUnitId, serviceGoalTemplateId, body)

Updates a service goal template

Wraps PATCH /api/v2/workforcemanagement/businessunits/{businessUnitId}/servicegoaltemplates/{serviceGoalTemplateId}

Requires ANY permissions:

- wfm:serviceGoalTemplate:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit.
String serviceGoalTemplateId = "serviceGoalTemplateId_example"; // String | The ID of a service goal template to update
UpdateServiceGoalTemplate body = new UpdateServiceGoalTemplate(); // UpdateServiceGoalTemplate | body
try {
    ServiceGoalTemplate result = apiInstance.patchWorkforcemanagementBusinessunitServicegoaltemplate(businessUnitId, serviceGoalTemplateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementBusinessunitServicegoaltemplate");
    e.printStackTrace();
}
```

### Parameters

| Name                      | Type                                                          | Description                                 | Notes      |
| ------------------------- | ------------------------------------------------------------- | ------------------------------------------- | ---------- |
| **businessUnitId**        | **String**                                                    | The ID of the business unit.                |
| **serviceGoalTemplateId** | **String**                                                    | The ID of a service goal template to update |
| **body**                  | [**UpdateServiceGoalTemplate**](UpdateServiceGoalTemplate.md) | body                                        | [optional] |

{: class="table-striped"}

### Return type

[**ServiceGoalTemplate**](ServiceGoalTemplate.md)

<a name="patchWorkforcemanagementManagementunit"></a>

# **patchWorkforcemanagementManagementunit**

> [ManagementUnit](ManagementUnit.md) patchWorkforcemanagementManagementunit(managementUnitId, body)

Update the requested management unit

Wraps PATCH /api/v2/workforcemanagement/managementunits/{managementUnitId}

Requires ANY permissions:

- wfm:managementUnit:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
UpdateManagementUnitRequest body = new UpdateManagementUnitRequest(); // UpdateManagementUnitRequest | body
try {
    ManagementUnit result = apiInstance.patchWorkforcemanagementManagementunit(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementManagementunit");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                              | Description                                                                                     | Notes      |
| -------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                        | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **body**             | [**UpdateManagementUnitRequest**](UpdateManagementUnitRequest.md) | body                                                                                            | [optional] |

{: class="table-striped"}

### Return type

[**ManagementUnit**](ManagementUnit.md)

<a name="patchWorkforcemanagementManagementunitTimeofflimit"></a>

# **patchWorkforcemanagementManagementunitTimeofflimit**

> [TimeOffLimit](TimeOffLimit.md) patchWorkforcemanagementManagementunitTimeofflimit(managementUnitId, timeOffLimitId, body)

Updates a time off limit object.

Updates time off limit object properties, but not daily values.

Wraps PATCH /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeofflimits/{timeOffLimitId}

Requires ANY permissions:

- wfm:timeOffLimit:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit.
String timeOffLimitId = "timeOffLimitId_example"; // String | The id of time off limit object to update
UpdateTimeOffLimitRequest body = new UpdateTimeOffLimitRequest(); // UpdateTimeOffLimitRequest | body
try {
    TimeOffLimit result = apiInstance.patchWorkforcemanagementManagementunitTimeofflimit(managementUnitId, timeOffLimitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementManagementunitTimeofflimit");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                          | Description                                    | Notes      |
| -------------------- | ------------------------------------------------------------- | ---------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                    | The management unit ID of the management unit. |
| **timeOffLimitId**   | **String**                                                    | The id of time off limit object to update      |
| **body**             | [**UpdateTimeOffLimitRequest**](UpdateTimeOffLimitRequest.md) | body                                           | [optional] |

{: class="table-striped"}

### Return type

[**TimeOffLimit**](TimeOffLimit.md)

<a name="patchWorkforcemanagementManagementunitTimeoffplan"></a>

# **patchWorkforcemanagementManagementunitTimeoffplan**

> [TimeOffPlan](TimeOffPlan.md) patchWorkforcemanagementManagementunitTimeoffplan(managementUnitId, timeOffPlanId, body)

Updates a time off plan

Wraps PATCH /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeoffplans/{timeOffPlanId}

Requires ANY permissions:

- wfm:timeOffPlan:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID.
String timeOffPlanId = "timeOffPlanId_example"; // String | The ID of the time off plan to update
UpdateTimeOffPlanRequest body = new UpdateTimeOffPlanRequest(); // UpdateTimeOffPlanRequest | body
try {
    TimeOffPlan result = apiInstance.patchWorkforcemanagementManagementunitTimeoffplan(managementUnitId, timeOffPlanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementManagementunitTimeoffplan");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                        | Description                           | Notes      |
| -------------------- | ----------------------------------------------------------- | ------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                  | The management unit ID.               |
| **timeOffPlanId**    | **String**                                                  | The ID of the time off plan to update |
| **body**             | [**UpdateTimeOffPlanRequest**](UpdateTimeOffPlanRequest.md) | body                                  | [optional] |

{: class="table-striped"}

### Return type

[**TimeOffPlan**](TimeOffPlan.md)

<a name="patchWorkforcemanagementManagementunitUserTimeoffrequest"></a>

# **patchWorkforcemanagementManagementunitUserTimeoffrequest**

> [TimeOffRequestResponse](TimeOffRequestResponse.md) patchWorkforcemanagementManagementunitUserTimeoffrequest(managementUnitId, userId, timeOffRequestId, body)

Update a time off request

Wraps PATCH /api/v2/workforcemanagement/managementunits/{managementUnitId}/users/{userId}/timeoffrequests/{timeOffRequestId}

Requires ANY permissions:

- wfm:timeOffRequest:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
String userId = "userId_example"; // String | The id of the user the requested time off request belongs to
String timeOffRequestId = "timeOffRequestId_example"; // String | The id of the time off request to update
AdminTimeOffRequestPatch body = new AdminTimeOffRequestPatch(); // AdminTimeOffRequestPatch | body
try {
    TimeOffRequestResponse result = apiInstance.patchWorkforcemanagementManagementunitUserTimeoffrequest(managementUnitId, userId, timeOffRequestId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementManagementunitUserTimeoffrequest");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                        | Description                                                                                       | Notes      |
| -------------------- | ----------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                  | The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **userId**           | **String**                                                  | The id of the user the requested time off request belongs to                                      |
| **timeOffRequestId** | **String**                                                  | The id of the time off request to update                                                          |
| **body**             | [**AdminTimeOffRequestPatch**](AdminTimeOffRequestPatch.md) | body                                                                                              | [optional] |

{: class="table-striped"}

### Return type

[**TimeOffRequestResponse**](TimeOffRequestResponse.md)

<a name="patchWorkforcemanagementManagementunitWeekShifttrade"></a>

# **patchWorkforcemanagementManagementunitWeekShifttrade**

> [ShiftTradeResponse](ShiftTradeResponse.md) patchWorkforcemanagementManagementunitWeekShifttrade(managementUnitId, weekDateId, body, tradeId)

Updates a shift trade. This route can only be called by the initiating agent

Wraps PATCH /api/v2/workforcemanagement/managementunits/{managementUnitId}/weeks/{weekDateId}/shifttrades/{tradeId}

Requires ANY permissions:

- wfm:agentShiftTradeRequest:participate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
LocalDate weekDateId = new LocalDate(); // LocalDate | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
PatchShiftTradeRequest body = new PatchShiftTradeRequest(); // PatchShiftTradeRequest | body
String tradeId = "tradeId_example"; // String | The ID of the shift trade to update
try {
    ShiftTradeResponse result = apiInstance.patchWorkforcemanagementManagementunitWeekShifttrade(managementUnitId, weekDateId, body, tradeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementManagementunitWeekShifttrade");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                    | Description                                                                                                                    | Notes |
| -------------------- | ------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------ | ----- |
| **managementUnitId** | **String**                                              | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user.                |
| **weekDateId**       | **LocalDate**                                           | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**             | [**PatchShiftTradeRequest**](PatchShiftTradeRequest.md) | body                                                                                                                           |
| **tradeId**          | **String**                                              | The ID of the shift trade to update                                                                                            |

{: class="table-striped"}

### Return type

[**ShiftTradeResponse**](ShiftTradeResponse.md)

<a name="patchWorkforcemanagementManagementunitWorkplan"></a>

# **patchWorkforcemanagementManagementunitWorkplan**

> [WorkPlan](WorkPlan.md) patchWorkforcemanagementManagementunitWorkplan(managementUnitId, workPlanId, body, validationMode)

Update a work plan

Wraps PATCH /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplans/{workPlanId}

Requires ANY permissions:

- wfm:workPlan:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String workPlanId = "workPlanId_example"; // String | The ID of the work plan to update
WorkPlan body = new WorkPlan(); // WorkPlan | body
String validationMode = "validationMode_example"; // String | Allows to update work plan even if validation result is invalid
try {
    WorkPlan result = apiInstance.patchWorkforcemanagementManagementunitWorkplan(managementUnitId, workPlanId, body, validationMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementManagementunitWorkplan");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                        | Description                                                                                     | Notes                              |
| -------------------- | --------------------------- | ----------------------------------------------------------------------------------------------- | ---------------------------------- |
| **managementUnitId** | **String**                  | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **workPlanId**       | **String**                  | The ID of the work plan to update                                                               |
| **body**             | [**WorkPlan**](WorkPlan.md) | body                                                                                            | [optional]                         |
| **validationMode**   | **String**                  | Allows to update work plan even if validation result is invalid                                 | [optional]<br />**Values**: Ignore |

{: class="table-striped"}

### Return type

[**WorkPlan**](WorkPlan.md)

<a name="patchWorkforcemanagementManagementunitWorkplanrotation"></a>

# **patchWorkforcemanagementManagementunitWorkplanrotation**

> [WorkPlanRotationResponse](WorkPlanRotationResponse.md) patchWorkforcemanagementManagementunitWorkplanrotation(managementUnitId, workPlanRotationId, body)

Update a work plan rotation

Wraps PATCH /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplanrotations/{workPlanRotationId}

Requires ANY permissions:

- wfm:workPlanRotation:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String workPlanRotationId = "workPlanRotationId_example"; // String | The ID of the work plan rotation to update
UpdateWorkPlanRotationRequest body = new UpdateWorkPlanRotationRequest(); // UpdateWorkPlanRotationRequest | body
try {
    WorkPlanRotationResponse result = apiInstance.patchWorkforcemanagementManagementunitWorkplanrotation(managementUnitId, workPlanRotationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementManagementunitWorkplanrotation");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type                                                                  | Description                                                                                     | Notes      |
| ---------------------- | --------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId**   | **String**                                                            | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **workPlanRotationId** | **String**                                                            | The ID of the work plan rotation to update                                                      |
| **body**               | [**UpdateWorkPlanRotationRequest**](UpdateWorkPlanRotationRequest.md) | body                                                                                            | [optional] |

{: class="table-striped"}

### Return type

[**WorkPlanRotationResponse**](WorkPlanRotationResponse.md)

<a name="patchWorkforcemanagementTimeoffrequest"></a>

# **patchWorkforcemanagementTimeoffrequest**

> [TimeOffRequestResponse](TimeOffRequestResponse.md) patchWorkforcemanagementTimeoffrequest(timeOffRequestId, body)

Update a time off request for the current user

Wraps PATCH /api/v2/workforcemanagement/timeoffrequests/{timeOffRequestId}

Requires ANY permissions:

- wfm:agentTimeOffRequest:submit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String timeOffRequestId = "timeOffRequestId_example"; // String | Time Off Request Id
AgentTimeOffRequestPatch body = new AgentTimeOffRequestPatch(); // AgentTimeOffRequestPatch | body
try {
    TimeOffRequestResponse result = apiInstance.patchWorkforcemanagementTimeoffrequest(timeOffRequestId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#patchWorkforcemanagementTimeoffrequest");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                        | Description         | Notes      |
| -------------------- | ----------------------------------------------------------- | ------------------- | ---------- |
| **timeOffRequestId** | **String**                                                  | Time Off Request Id |
| **body**             | [**AgentTimeOffRequestPatch**](AgentTimeOffRequestPatch.md) | body                | [optional] |

{: class="table-striped"}

### Return type

[**TimeOffRequestResponse**](TimeOffRequestResponse.md)

<a name="postWorkforcemanagementAdherenceHistorical"></a>

# **postWorkforcemanagementAdherenceHistorical**

> [WfmHistoricalAdherenceResponse](WfmHistoricalAdherenceResponse.md) postWorkforcemanagementAdherenceHistorical(body)

Request a historical adherence report for users across management units

Wraps POST /api/v2/workforcemanagement/adherence/historical

Requires ANY permissions:

- wfm:historicalAdherence:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
WfmHistoricalAdherenceQueryForUsers body = new WfmHistoricalAdherenceQueryForUsers(); // WfmHistoricalAdherenceQueryForUsers | body
try {
    WfmHistoricalAdherenceResponse result = apiInstance.postWorkforcemanagementAdherenceHistorical(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementAdherenceHistorical");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                              | Description | Notes      |
| -------- | --------------------------------------------------------------------------------- | ----------- | ---------- |
| **body** | [**WfmHistoricalAdherenceQueryForUsers**](WfmHistoricalAdherenceQueryForUsers.md) | body        | [optional] |

{: class="table-striped"}

### Return type

[**WfmHistoricalAdherenceResponse**](WfmHistoricalAdherenceResponse.md)

<a name="postWorkforcemanagementAgentschedulesMine"></a>

# **postWorkforcemanagementAgentschedulesMine**

> [BuCurrentAgentScheduleSearchResponse](BuCurrentAgentScheduleSearchResponse.md) postWorkforcemanagementAgentschedulesMine(body)

Get published schedule for the current user

Wraps POST /api/v2/workforcemanagement/agentschedules/mine

Requires ANY permissions:

- wfm:agentSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
BuGetCurrentAgentScheduleRequest body = new BuGetCurrentAgentScheduleRequest(); // BuGetCurrentAgentScheduleRequest | body
try {
    BuCurrentAgentScheduleSearchResponse result = apiInstance.postWorkforcemanagementAgentschedulesMine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementAgentschedulesMine");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                        | Description | Notes      |
| -------- | --------------------------------------------------------------------------- | ----------- | ---------- |
| **body** | [**BuGetCurrentAgentScheduleRequest**](BuGetCurrentAgentScheduleRequest.md) | body        | [optional] |

{: class="table-striped"}

### Return type

[**BuCurrentAgentScheduleSearchResponse**](BuCurrentAgentScheduleSearchResponse.md)

<a name="postWorkforcemanagementBusinessunitActivitycodes"></a>

# **postWorkforcemanagementBusinessunitActivitycodes**

> [BusinessUnitActivityCode](BusinessUnitActivityCode.md) postWorkforcemanagementBusinessunitActivitycodes(businessUnitId, body)

Create a new activity code

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/activitycodes

Requires ANY permissions:

- wfm:activityCode:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit, or 'mine' for the business unit of the logged-in user.
CreateActivityCodeRequest body = new CreateActivityCodeRequest(); // CreateActivityCodeRequest | body
try {
    BusinessUnitActivityCode result = apiInstance.postWorkforcemanagementBusinessunitActivitycodes(businessUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitActivitycodes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                          | Description                                                                                 | Notes      |
| ------------------ | ------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ---------- |
| **businessUnitId** | **String**                                                    | The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. |
| **body**           | [**CreateActivityCodeRequest**](CreateActivityCodeRequest.md) | body                                                                                        | [optional] |

{: class="table-striped"}

### Return type

[**BusinessUnitActivityCode**](BusinessUnitActivityCode.md)

<a name="postWorkforcemanagementBusinessunitAgentschedulesSearch"></a>

# **postWorkforcemanagementBusinessunitAgentschedulesSearch**

> [BuAsyncAgentSchedulesSearchResponse](BuAsyncAgentSchedulesSearchResponse.md) postWorkforcemanagementBusinessunitAgentschedulesSearch(businessUnitId, body, forceAsync, forceDownloadService)

Search published schedules

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/agentschedules/search

Requires ANY permissions:

- wfm:schedule:view
- wfm:publishedSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
BuSearchAgentSchedulesRequest body = new BuSearchAgentSchedulesRequest(); // BuSearchAgentSchedulesRequest | body
Boolean forceAsync = true; // Boolean | Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes
Boolean forceDownloadService = true; // Boolean | Force the result of this operation to be sent via download service.  For testing/app development purposes
try {
    BuAsyncAgentSchedulesSearchResponse result = apiInstance.postWorkforcemanagementBusinessunitAgentschedulesSearch(businessUnitId, body, forceAsync, forceDownloadService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitAgentschedulesSearch");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                                                                  | Description                                                                                                         | Notes      |
| ------------------------ | --------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ---------- |
| **businessUnitId**       | **String**                                                            | The ID of the business unit                                                                                         |
| **body**                 | [**BuSearchAgentSchedulesRequest**](BuSearchAgentSchedulesRequest.md) | body                                                                                                                | [optional] |
| **forceAsync**           | **Boolean**                                                           | Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes | [optional] |
| **forceDownloadService** | **Boolean**                                                           | Force the result of this operation to be sent via download service. For testing/app development purposes            | [optional] |

{: class="table-striped"}

### Return type

[**BuAsyncAgentSchedulesSearchResponse**](BuAsyncAgentSchedulesSearchResponse.md)

<a name="postWorkforcemanagementBusinessunitIntraday"></a>

# **postWorkforcemanagementBusinessunitIntraday**

> [AsyncIntradayResponse](AsyncIntradayResponse.md) postWorkforcemanagementBusinessunitIntraday(businessUnitId, forceAsync, body)

Get intraday data for the given date for the requested planningGroupIds

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/intraday

Requires ANY permissions:

- wfm:intraday:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit
Boolean forceAsync = true; // Boolean | Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes
IntradayPlanningGroupRequest body = new IntradayPlanningGroupRequest(); // IntradayPlanningGroupRequest | body
try {
    AsyncIntradayResponse result = apiInstance.postWorkforcemanagementBusinessunitIntraday(businessUnitId, forceAsync, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitIntraday");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                                | Description                                                                                                         | Notes      |
| ------------------ | ------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ---------- |
| **businessUnitId** | **String**                                                          | The business unit ID of the business unit                                                                           |
| **forceAsync**     | **Boolean**                                                         | Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes | [optional] |
| **body**           | [**IntradayPlanningGroupRequest**](IntradayPlanningGroupRequest.md) | body                                                                                                                | [optional] |

{: class="table-striped"}

### Return type

[**AsyncIntradayResponse**](AsyncIntradayResponse.md)

<a name="postWorkforcemanagementBusinessunitPlanninggroups"></a>

# **postWorkforcemanagementBusinessunitPlanninggroups**

> [PlanningGroup](PlanningGroup.md) postWorkforcemanagementBusinessunitPlanninggroups(businessUnitId, body)

Adds a new planning group

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/planninggroups

Requires ANY permissions:

- wfm:planningGroup:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit.
CreatePlanningGroupRequest body = new CreatePlanningGroupRequest(); // CreatePlanningGroupRequest | body
try {
    PlanningGroup result = apiInstance.postWorkforcemanagementBusinessunitPlanninggroups(businessUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitPlanninggroups");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                            | Description                  | Notes      |
| ------------------ | --------------------------------------------------------------- | ---------------------------- | ---------- |
| **businessUnitId** | **String**                                                      | The ID of the business unit. |
| **body**           | [**CreatePlanningGroupRequest**](CreatePlanningGroupRequest.md) | body                         | [optional] |

{: class="table-striped"}

### Return type

[**PlanningGroup**](PlanningGroup.md)

<a name="postWorkforcemanagementBusinessunitServicegoaltemplates"></a>

# **postWorkforcemanagementBusinessunitServicegoaltemplates**

> [ServiceGoalTemplate](ServiceGoalTemplate.md) postWorkforcemanagementBusinessunitServicegoaltemplates(businessUnitId, body)

Adds a new service goal template

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/servicegoaltemplates

Requires ANY permissions:

- wfm:serviceGoalTemplate:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit.
CreateServiceGoalTemplate body = new CreateServiceGoalTemplate(); // CreateServiceGoalTemplate | body
try {
    ServiceGoalTemplate result = apiInstance.postWorkforcemanagementBusinessunitServicegoaltemplates(businessUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitServicegoaltemplates");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                          | Description                  | Notes      |
| ------------------ | ------------------------------------------------------------- | ---------------------------- | ---------- |
| **businessUnitId** | **String**                                                    | The ID of the business unit. |
| **body**           | [**CreateServiceGoalTemplate**](CreateServiceGoalTemplate.md) | body                         | [optional] |

{: class="table-striped"}

### Return type

[**ServiceGoalTemplate**](ServiceGoalTemplate.md)

<a name="postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery"></a>

# **postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery**

> [BuAsyncAgentSchedulesQueryResponse](BuAsyncAgentSchedulesQueryResponse.md) postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery(businessUnitId, weekId, scheduleId, body, forceAsync, forceDownloadService)

Loads agent schedule data from the schedule. Used in combination with the metadata route

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}/agentschedules/query

Requires ANY permissions:

- wfm:schedule:view
- wfm:publishedSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String scheduleId = "scheduleId_example"; // String | The ID of the schedule
BuQueryAgentSchedulesRequest body = new BuQueryAgentSchedulesRequest(); // BuQueryAgentSchedulesRequest | body
Boolean forceAsync = true; // Boolean | Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes
Boolean forceDownloadService = true; // Boolean | Force the result of this operation to be sent via download service.  For testing/app development purposes
try {
    BuAsyncAgentSchedulesQueryResponse result = apiInstance.postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery(businessUnitId, weekId, scheduleId, body, forceAsync, forceDownloadService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                                                                | Description                                                                                                           | Notes      |
| ------------------------ | ------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **businessUnitId**       | **String**                                                          | The ID of the business unit                                                                                           |
| **weekId**               | **LocalDate**                                                       | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **scheduleId**           | **String**                                                          | The ID of the schedule                                                                                                |
| **body**                 | [**BuQueryAgentSchedulesRequest**](BuQueryAgentSchedulesRequest.md) | body                                                                                                                  |
| **forceAsync**           | **Boolean**                                                         | Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes   | [optional] |
| **forceDownloadService** | **Boolean**                                                         | Force the result of this operation to be sent via download service. For testing/app development purposes              | [optional] |

{: class="table-striped"}

### Return type

[**BuAsyncAgentSchedulesQueryResponse**](BuAsyncAgentSchedulesQueryResponse.md)

<a name="postWorkforcemanagementBusinessunitWeekScheduleCopy"></a>

# **postWorkforcemanagementBusinessunitWeekScheduleCopy**

> [BuAsyncScheduleResponse](BuAsyncScheduleResponse.md) postWorkforcemanagementBusinessunitWeekScheduleCopy(businessUnitId, weekId, scheduleId, body)

Copy a schedule

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}/copy

Requires ANY permissions:

- wfm:schedule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String scheduleId = "scheduleId_example"; // String | The ID of the schedule to copy
BuCopyScheduleRequest body = new BuCopyScheduleRequest(); // BuCopyScheduleRequest | body
try {
    BuAsyncScheduleResponse result = apiInstance.postWorkforcemanagementBusinessunitWeekScheduleCopy(businessUnitId, weekId, scheduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekScheduleCopy");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description                                                                                                           | Notes |
| ------------------ | ----------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**                                            | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate**                                         | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **scheduleId**     | **String**                                            | The ID of the schedule to copy                                                                                        |
| **body**           | [**BuCopyScheduleRequest**](BuCopyScheduleRequest.md) | body                                                                                                                  |

{: class="table-striped"}

### Return type

[**BuAsyncScheduleResponse**](BuAsyncScheduleResponse.md)

<a name="postWorkforcemanagementBusinessunitWeekScheduleReschedule"></a>

# **postWorkforcemanagementBusinessunitWeekScheduleReschedule**

> [BuAsyncScheduleRunResponse](BuAsyncScheduleRunResponse.md) postWorkforcemanagementBusinessunitWeekScheduleReschedule(businessUnitId, weekId, scheduleId, body)

Start a rescheduling run

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}/reschedule

Requires ANY permissions:

- wfm:schedule:generate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String scheduleId = "scheduleId_example"; // String | The ID of the schedule
BuRescheduleRequest body = new BuRescheduleRequest(); // BuRescheduleRequest | body
try {
    BuAsyncScheduleRunResponse result = apiInstance.postWorkforcemanagementBusinessunitWeekScheduleReschedule(businessUnitId, weekId, scheduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekScheduleReschedule");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                              | Description                                                                                                           | Notes |
| ------------------ | ------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**                                        | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate**                                     | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **scheduleId**     | **String**                                        | The ID of the schedule                                                                                                |
| **body**           | [**BuRescheduleRequest**](BuRescheduleRequest.md) | body                                                                                                                  |

{: class="table-striped"}

### Return type

[**BuAsyncScheduleRunResponse**](BuAsyncScheduleRunResponse.md)

<a name="postWorkforcemanagementBusinessunitWeekScheduleUpdate"></a>

# **postWorkforcemanagementBusinessunitWeekScheduleUpdate**

> [BuAsyncScheduleResponse](BuAsyncScheduleResponse.md) postWorkforcemanagementBusinessunitWeekScheduleUpdate(businessUnitId, weekId, scheduleId, body)

Starts processing a schedule update

Call after uploading the schedule data to the url supplied by the /update/uploadurl route

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}/update

Requires ANY permissions:

- wfm:schedule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String scheduleId = "scheduleId_example"; // String | The ID of the schedule
ProcessScheduleUpdateUploadRequest body = new ProcessScheduleUpdateUploadRequest(); // ProcessScheduleUpdateUploadRequest | body
try {
    BuAsyncScheduleResponse result = apiInstance.postWorkforcemanagementBusinessunitWeekScheduleUpdate(businessUnitId, weekId, scheduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekScheduleUpdate");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                                            | Description                                                                                                           | Notes |
| ------------------ | ------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**                                                                      | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate**                                                                   | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **scheduleId**     | **String**                                                                      | The ID of the schedule                                                                                                |
| **body**           | [**ProcessScheduleUpdateUploadRequest**](ProcessScheduleUpdateUploadRequest.md) | body                                                                                                                  |

{: class="table-striped"}

### Return type

[**BuAsyncScheduleResponse**](BuAsyncScheduleResponse.md)

<a name="postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl"></a>

# **postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl**

> [UpdateScheduleUploadResponse](UpdateScheduleUploadResponse.md) postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl(businessUnitId, weekId, scheduleId, body)

Creates a signed upload URL for updating a schedule

Once the upload is complete, call the /{scheduleId}/update route to start the schedule update process

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}/update/uploadurl

Requires ANY permissions:

- wfm:schedule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String scheduleId = "scheduleId_example"; // String | The ID of the schedule
UploadUrlRequestBody body = new UploadUrlRequestBody(); // UploadUrlRequestBody | body
try {
    UpdateScheduleUploadResponse result = apiInstance.postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl(businessUnitId, weekId, scheduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                | Description                                                                                                           | Notes |
| ------------------ | --------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**                                          | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate**                                       | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **scheduleId**     | **String**                                          | The ID of the schedule                                                                                                |
| **body**           | [**UploadUrlRequestBody**](UploadUrlRequestBody.md) | body                                                                                                                  |

{: class="table-striped"}

### Return type

[**UpdateScheduleUploadResponse**](UpdateScheduleUploadResponse.md)

<a name="postWorkforcemanagementBusinessunitWeekSchedules"></a>

# **postWorkforcemanagementBusinessunitWeekSchedules**

> [BuScheduleMetadata](BuScheduleMetadata.md) postWorkforcemanagementBusinessunitWeekSchedules(businessUnitId, weekId, body)

Create a blank schedule

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules

Requires ANY permissions:

- wfm:schedule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
BuCreateBlankScheduleRequest body = new BuCreateBlankScheduleRequest(); // BuCreateBlankScheduleRequest | body
try {
    BuScheduleMetadata result = apiInstance.postWorkforcemanagementBusinessunitWeekSchedules(businessUnitId, weekId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekSchedules");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                                | Description                                                                                                           | Notes |
| ------------------ | ------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**                                                          | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate**                                                       | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**           | [**BuCreateBlankScheduleRequest**](BuCreateBlankScheduleRequest.md) | body                                                                                                                  |

{: class="table-striped"}

### Return type

[**BuScheduleMetadata**](BuScheduleMetadata.md)

<a name="postWorkforcemanagementBusinessunitWeekSchedulesGenerate"></a>

# **postWorkforcemanagementBusinessunitWeekSchedulesGenerate**

> [BuAsyncScheduleRunResponse](BuAsyncScheduleRunResponse.md) postWorkforcemanagementBusinessunitWeekSchedulesGenerate(businessUnitId, weekId, body)

Generate a schedule

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/generate

Requires ANY permissions:

- wfm:schedule:generate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
BuGenerateScheduleRequest body = new BuGenerateScheduleRequest(); // BuGenerateScheduleRequest | body
try {
    BuAsyncScheduleRunResponse result = apiInstance.postWorkforcemanagementBusinessunitWeekSchedulesGenerate(businessUnitId, weekId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekSchedulesGenerate");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                          | Description                                                                                                           | Notes |
| ------------------ | ------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**                                                    | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate**                                                 | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**           | [**BuGenerateScheduleRequest**](BuGenerateScheduleRequest.md) | body                                                                                                                  |

{: class="table-striped"}

### Return type

[**BuAsyncScheduleRunResponse**](BuAsyncScheduleRunResponse.md)

<a name="postWorkforcemanagementBusinessunitWeekSchedulesImport"></a>

# **postWorkforcemanagementBusinessunitWeekSchedulesImport**

> [ScheduleUploadProcessingResponse](ScheduleUploadProcessingResponse.md) postWorkforcemanagementBusinessunitWeekSchedulesImport(businessUnitId, weekId, body)

Starts processing a schedule import

Call after uploading the schedule data to the url supplied by the /import/uploadurl route

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/import

Requires ANY permissions:

- wfm:schedule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
WfmProcessUploadRequest body = new WfmProcessUploadRequest(); // WfmProcessUploadRequest |
try {
    ScheduleUploadProcessingResponse result = apiInstance.postWorkforcemanagementBusinessunitWeekSchedulesImport(businessUnitId, weekId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekSchedulesImport");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                      | Description                                                                                                           | Notes |
| ------------------ | --------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**                                                | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate**                                             | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**           | [**WfmProcessUploadRequest**](WfmProcessUploadRequest.md) |                                                                                                                       |

{: class="table-striped"}

### Return type

[**ScheduleUploadProcessingResponse**](ScheduleUploadProcessingResponse.md)

<a name="postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl"></a>

# **postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl**

> [ImportScheduleUploadResponse](ImportScheduleUploadResponse.md) postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl(businessUnitId, weekId, body)

Creates a signed upload URL for importing a schedule

Once the upload is complete, call the /import route to start the schedule import process

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/import/uploadurl

Requires ANY permissions:

- wfm:schedule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The ID of the business unit
LocalDate weekId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
UploadUrlRequestBody body = new UploadUrlRequestBody(); // UploadUrlRequestBody | body
try {
    ImportScheduleUploadResponse result = apiInstance.postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl(businessUnitId, weekId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                | Description                                                                                                           | Notes |
| ------------------ | --------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**                                          | The ID of the business unit                                                                                           |
| **weekId**         | **LocalDate**                                       | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**           | [**UploadUrlRequestBody**](UploadUrlRequestBody.md) | body                                                                                                                  |

{: class="table-striped"}

### Return type

[**ImportScheduleUploadResponse**](ImportScheduleUploadResponse.md)

<a name="postWorkforcemanagementBusinessunitWeekShorttermforecastCopy"></a>

# **postWorkforcemanagementBusinessunitWeekShorttermforecastCopy**

> [AsyncForecastOperationResult](AsyncForecastOperationResult.md) postWorkforcemanagementBusinessunitWeekShorttermforecastCopy(businessUnitId, weekDateId, forecastId, body, forceAsync)

Copy a short term forecast

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/{forecastId}/copy

Requires ANY permissions:

- wfm:shortTermForecast:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
LocalDate weekDateId = new LocalDate(); // LocalDate | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String forecastId = "forecastId_example"; // String | The ID of the forecast to copy
CopyBuForecastRequest body = new CopyBuForecastRequest(); // CopyBuForecastRequest | body
Boolean forceAsync = true; // Boolean | Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes
try {
    AsyncForecastOperationResult result = apiInstance.postWorkforcemanagementBusinessunitWeekShorttermforecastCopy(businessUnitId, weekDateId, forecastId, body, forceAsync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekShorttermforecastCopy");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description                                                                                                                    | Notes      |
| ------------------ | ----------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **businessUnitId** | **String**                                            | The business unit ID of the business unit to which the forecast belongs                                                        |
| **weekDateId**     | **LocalDate**                                         | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **forecastId**     | **String**                                            | The ID of the forecast to copy                                                                                                 |
| **body**           | [**CopyBuForecastRequest**](CopyBuForecastRequest.md) | body                                                                                                                           |
| **forceAsync**     | **Boolean**                                           | Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes            | [optional] |

{: class="table-striped"}

### Return type

[**AsyncForecastOperationResult**](AsyncForecastOperationResult.md)

<a name="postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate"></a>

# **postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate**

> [AsyncForecastOperationResult](AsyncForecastOperationResult.md) postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate(businessUnitId, weekDateId, body, forceAsync)

Generate a short term forecast

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/generate

Requires ANY permissions:

- wfm:shortTermForecast:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
LocalDate weekDateId = new LocalDate(); // LocalDate | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
GenerateBuForecastRequest body = new GenerateBuForecastRequest(); // GenerateBuForecastRequest |
Boolean forceAsync = true; // Boolean | Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes
try {
    AsyncForecastOperationResult result = apiInstance.postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate(businessUnitId, weekDateId, body, forceAsync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                          | Description                                                                                                                    | Notes      |
| ------------------ | ------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **businessUnitId** | **String**                                                    | The business unit ID of the business unit to which the forecast belongs                                                        |
| **weekDateId**     | **LocalDate**                                                 | The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**           | [**GenerateBuForecastRequest**](GenerateBuForecastRequest.md) |                                                                                                                                |
| **forceAsync**     | **Boolean**                                                   | Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes            | [optional] |

{: class="table-striped"}

### Return type

[**AsyncForecastOperationResult**](AsyncForecastOperationResult.md)

<a name="postWorkforcemanagementBusinessunitWeekShorttermforecastsImport"></a>

# **postWorkforcemanagementBusinessunitWeekShorttermforecastsImport**

> [ImportForecastResponse](ImportForecastResponse.md) postWorkforcemanagementBusinessunitWeekShorttermforecastsImport(businessUnitId, weekDateId, body)

Starts importing the uploaded short term forecast

Call after uploading the forecast data to the url supplied by the /import/uploadurl route

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/import

Requires ANY permissions:

- wfm:shortTermForecast:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
LocalDate weekDateId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
WfmProcessUploadRequest body = new WfmProcessUploadRequest(); // WfmProcessUploadRequest |
try {
    ImportForecastResponse result = apiInstance.postWorkforcemanagementBusinessunitWeekShorttermforecastsImport(businessUnitId, weekDateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekShorttermforecastsImport");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                      | Description                                                                                                           | Notes |
| ------------------ | --------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**                                                | The business unit ID of the business unit to which the forecast belongs                                               |
| **weekDateId**     | **LocalDate**                                             | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**           | [**WfmProcessUploadRequest**](WfmProcessUploadRequest.md) |                                                                                                                       |

{: class="table-striped"}

### Return type

[**ImportForecastResponse**](ImportForecastResponse.md)

<a name="postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl"></a>

# **postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl**

> [ImportForecastUploadResponse](ImportForecastUploadResponse.md) postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl(businessUnitId, weekDateId, body)

Creates a signed upload URL for importing a short term forecast

Once the upload is complete, call the /import route to start the short term forecast import process

Wraps POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/import/uploadurl

Requires ANY permissions:

- wfm:shortTermForecast:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String businessUnitId = "businessUnitId_example"; // String | The business unit ID of the business unit to which the forecast belongs
LocalDate weekDateId = new LocalDate(); // LocalDate | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
UploadUrlRequestBody body = new UploadUrlRequestBody(); // UploadUrlRequestBody | body
try {
    ImportForecastUploadResponse result = apiInstance.postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl(businessUnitId, weekDateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                | Description                                                                                                           | Notes |
| ------------------ | --------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | ----- |
| **businessUnitId** | **String**                                          | The business unit ID of the business unit to which the forecast belongs                                               |
| **weekDateId**     | **LocalDate**                                       | First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**           | [**UploadUrlRequestBody**](UploadUrlRequestBody.md) | body                                                                                                                  |

{: class="table-striped"}

### Return type

[**ImportForecastUploadResponse**](ImportForecastUploadResponse.md)

<a name="postWorkforcemanagementBusinessunits"></a>

# **postWorkforcemanagementBusinessunits**

> [BusinessUnit](BusinessUnit.md) postWorkforcemanagementBusinessunits(body)

Add a new business unit

It may take a minute or two for a new business unit to be available for api operations

Wraps POST /api/v2/workforcemanagement/businessunits

Requires ANY permissions:

- wfm:businessUnit:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
CreateBusinessUnitRequest body = new CreateBusinessUnitRequest(); // CreateBusinessUnitRequest | body
try {
    BusinessUnit result = apiInstance.postWorkforcemanagementBusinessunits(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementBusinessunits");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                          | Description | Notes      |
| -------- | ------------------------------------------------------------- | ----------- | ---------- |
| **body** | [**CreateBusinessUnitRequest**](CreateBusinessUnitRequest.md) | body        | [optional] |

{: class="table-striped"}

### Return type

[**BusinessUnit**](BusinessUnit.md)

<a name="postWorkforcemanagementCalendarUrlIcs"></a>

# **postWorkforcemanagementCalendarUrlIcs**

> [CalendarUrlResponse](CalendarUrlResponse.md) postWorkforcemanagementCalendarUrlIcs(language)

Create a newly generated calendar link for the current user; if the current user has previously generated one, the generated link will be returned

Wraps POST /api/v2/workforcemanagement/calendar/url/ics

Requires ALL permissions:

- wfm:agentSchedule:sync
- wfm:agentSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String language = "en-US"; // String | A language tag (which is sometimes referred to as a \"locale identifier\") to use to localize default activity code names in the ics-formatted calendar
try {
    CalendarUrlResponse result = apiInstance.postWorkforcemanagementCalendarUrlIcs(language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementCalendarUrlIcs");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description                                                                                                                                                       | Notes                         |
| ------------ | ---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------- |
| **language** | **String** | A language tag (which is sometimes referred to as a \&quot;locale identifier\&quot;) to use to localize default activity code names in the ics-formatted calendar | [optional] [default to en-US] |

{: class="table-striped"}

### Return type

[**CalendarUrlResponse**](CalendarUrlResponse.md)

<a name="postWorkforcemanagementHistoricaldataDeletejob"></a>

# **postWorkforcemanagementHistoricaldataDeletejob**

> [HistoricalImportDeleteJobResponse](HistoricalImportDeleteJobResponse.md) postWorkforcemanagementHistoricaldataDeletejob()

Delete the entries of the historical data imports in the organization

Wraps POST /api/v2/workforcemanagement/historicaldata/deletejob

Requires ALL permissions:

- wfm:historicalData:upload

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
try {
    HistoricalImportDeleteJobResponse result = apiInstance.postWorkforcemanagementHistoricaldataDeletejob();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementHistoricaldataDeletejob");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**HistoricalImportDeleteJobResponse**](HistoricalImportDeleteJobResponse.md)

<a name="postWorkforcemanagementHistoricaldataValidate"></a>

# **postWorkforcemanagementHistoricaldataValidate**

> Void postWorkforcemanagementHistoricaldataValidate(body)

Trigger validation process for historical import

Wraps POST /api/v2/workforcemanagement/historicaldata/validate

Requires ALL permissions:

- wfm:historicalData:upload

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
ValidationServiceRequest body = new ValidationServiceRequest(); // ValidationServiceRequest | body
try {
    apiInstance.postWorkforcemanagementHistoricaldataValidate(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementHistoricaldataValidate");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                        | Description | Notes      |
| -------- | ----------------------------------------------------------- | ----------- | ---------- |
| **body** | [**ValidationServiceRequest**](ValidationServiceRequest.md) | body        | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postWorkforcemanagementManagementunitAgentschedulesSearch"></a>

# **postWorkforcemanagementManagementunitAgentschedulesSearch**

> [BuAsyncAgentSchedulesSearchResponse](BuAsyncAgentSchedulesSearchResponse.md) postWorkforcemanagementManagementunitAgentschedulesSearch(managementUnitId, body, forceAsync, forceDownloadService)

Query published schedules for given given time range for set of users

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/agentschedules/search

Requires ANY permissions:

- wfm:publishedSchedule:view
- wfm:schedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
BuSearchAgentSchedulesRequest body = new BuSearchAgentSchedulesRequest(); // BuSearchAgentSchedulesRequest | body
Boolean forceAsync = true; // Boolean | Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes
Boolean forceDownloadService = true; // Boolean | Force the result of this operation to be sent via download service.  For testing/app development purposes
try {
    BuAsyncAgentSchedulesSearchResponse result = apiInstance.postWorkforcemanagementManagementunitAgentschedulesSearch(managementUnitId, body, forceAsync, forceDownloadService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitAgentschedulesSearch");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                                                                  | Description                                                                                                         | Notes      |
| ------------------------ | --------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId**     | **String**                                                            | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user.     |
| **body**                 | [**BuSearchAgentSchedulesRequest**](BuSearchAgentSchedulesRequest.md) | body                                                                                                                | [optional] |
| **forceAsync**           | **Boolean**                                                           | Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes | [optional] |
| **forceDownloadService** | **Boolean**                                                           | Force the result of this operation to be sent via download service. For testing/app development purposes            | [optional] |

{: class="table-striped"}

### Return type

[**BuAsyncAgentSchedulesSearchResponse**](BuAsyncAgentSchedulesSearchResponse.md)

<a name="postWorkforcemanagementManagementunitHistoricaladherencequery"></a>

# **postWorkforcemanagementManagementunitHistoricaladherencequery**

> [WfmHistoricalAdherenceResponse](WfmHistoricalAdherenceResponse.md) postWorkforcemanagementManagementunitHistoricaladherencequery(managementUnitId, body)

Request a historical adherence report

The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/historicaladherencequery

Requires ANY permissions:

- wfm:historicalAdherence:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit
WfmHistoricalAdherenceQuery body = new WfmHistoricalAdherenceQuery(); // WfmHistoricalAdherenceQuery | body
try {
    WfmHistoricalAdherenceResponse result = apiInstance.postWorkforcemanagementManagementunitHistoricaladherencequery(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitHistoricaladherencequery");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                              | Description                                   | Notes      |
| -------------------- | ----------------------------------------------------------------- | --------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                        | The management unit ID of the management unit |
| **body**             | [**WfmHistoricalAdherenceQuery**](WfmHistoricalAdherenceQuery.md) | body                                          | [optional] |

{: class="table-striped"}

### Return type

[**WfmHistoricalAdherenceResponse**](WfmHistoricalAdherenceResponse.md)

<a name="postWorkforcemanagementManagementunitMove"></a>

# **postWorkforcemanagementManagementunitMove**

> [MoveManagementUnitResponse](MoveManagementUnitResponse.md) postWorkforcemanagementManagementunitMove(managementUnitId, body)

Move the requested management unit to a new business unit

Returns status 200 if the management unit is already in the requested business unit

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/move

Requires ALL permissions:

- wfm:managementUnit:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
MoveManagementUnitRequest body = new MoveManagementUnitRequest(); // MoveManagementUnitRequest | body
try {
    MoveManagementUnitResponse result = apiInstance.postWorkforcemanagementManagementunitMove(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitMove");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                          | Description                                                                                     | Notes      |
| -------------------- | ------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                    | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **body**             | [**MoveManagementUnitRequest**](MoveManagementUnitRequest.md) | body                                                                                            | [optional] |

{: class="table-striped"}

### Return type

[**MoveManagementUnitResponse**](MoveManagementUnitResponse.md)

<a name="postWorkforcemanagementManagementunitSchedulesSearch"></a>

# **postWorkforcemanagementManagementunitSchedulesSearch**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [UserScheduleContainer](UserScheduleContainer.md) postWorkforcemanagementManagementunitSchedulesSearch(managementUnitId, body)

Query published schedules for given given time range for set of users

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/schedules/search

Requires ANY permissions:

- wfm:publishedSchedule:view
- wfm:schedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
UserListScheduleRequestBody body = new UserListScheduleRequestBody(); // UserListScheduleRequestBody | body
try {
    UserScheduleContainer result = apiInstance.postWorkforcemanagementManagementunitSchedulesSearch(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitSchedulesSearch");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                              | Description                                                                                                     | Notes      |
| -------------------- | ----------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                        | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **body**             | [**UserListScheduleRequestBody**](UserListScheduleRequestBody.md) | body                                                                                                            | [optional] |

{: class="table-striped"}

### Return type

[**UserScheduleContainer**](UserScheduleContainer.md)

<a name="postWorkforcemanagementManagementunitTimeofflimits"></a>

# **postWorkforcemanagementManagementunitTimeofflimits**

> [TimeOffLimit](TimeOffLimit.md) postWorkforcemanagementManagementunitTimeofflimits(managementUnitId, body)

Creates a new time off limit object under management unit.

Only one limit object is allowed under management unit, so an attempt to create second object will fail.

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeofflimits

Requires ANY permissions:

- wfm:timeOffLimit:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit.
CreateTimeOffLimitRequest body = new CreateTimeOffLimitRequest(); // CreateTimeOffLimitRequest | body
try {
    TimeOffLimit result = apiInstance.postWorkforcemanagementManagementunitTimeofflimits(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitTimeofflimits");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                          | Description                                    | Notes      |
| -------------------- | ------------------------------------------------------------- | ---------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                    | The management unit ID of the management unit. |
| **body**             | [**CreateTimeOffLimitRequest**](CreateTimeOffLimitRequest.md) | body                                           | [optional] |

{: class="table-striped"}

### Return type

[**TimeOffLimit**](TimeOffLimit.md)

<a name="postWorkforcemanagementManagementunitTimeofflimitsValuesQuery"></a>

# **postWorkforcemanagementManagementunitTimeofflimitsValuesQuery**

> [QueryTimeOffLimitValuesResponse](QueryTimeOffLimitValuesResponse.md) postWorkforcemanagementManagementunitTimeofflimitsValuesQuery(managementUnitId, body)

Retrieves time off limit related values based on a given set of filters.

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeofflimits/values/query

Requires ANY permissions:

- wfm:timeOffLimit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit.
QueryTimeOffLimitValuesRequest body = new QueryTimeOffLimitValuesRequest(); // QueryTimeOffLimitValuesRequest | body
try {
    QueryTimeOffLimitValuesResponse result = apiInstance.postWorkforcemanagementManagementunitTimeofflimitsValuesQuery(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitTimeofflimitsValuesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                                    | Description                                    | Notes      |
| -------------------- | ----------------------------------------------------------------------- | ---------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                              | The management unit ID of the management unit. |
| **body**             | [**QueryTimeOffLimitValuesRequest**](QueryTimeOffLimitValuesRequest.md) | body                                           | [optional] |

{: class="table-striped"}

### Return type

[**QueryTimeOffLimitValuesResponse**](QueryTimeOffLimitValuesResponse.md)

<a name="postWorkforcemanagementManagementunitTimeoffplans"></a>

# **postWorkforcemanagementManagementunitTimeoffplans**

> [TimeOffPlan](TimeOffPlan.md) postWorkforcemanagementManagementunitTimeoffplans(managementUnitId, body)

Creates a new time off plan

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeoffplans

Requires ANY permissions:

- wfm:timeOffPlan:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID.
CreateTimeOffPlanRequest body = new CreateTimeOffPlanRequest(); // CreateTimeOffPlanRequest | body
try {
    TimeOffPlan result = apiInstance.postWorkforcemanagementManagementunitTimeoffplans(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitTimeoffplans");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                        | Description             | Notes      |
| -------------------- | ----------------------------------------------------------- | ----------------------- | ---------- |
| **managementUnitId** | **String**                                                  | The management unit ID. |
| **body**             | [**CreateTimeOffPlanRequest**](CreateTimeOffPlanRequest.md) | body                    | [optional] |

{: class="table-striped"}

### Return type

[**TimeOffPlan**](TimeOffPlan.md)

<a name="postWorkforcemanagementManagementunitTimeoffrequests"></a>

# **postWorkforcemanagementManagementunitTimeoffrequests**

> [TimeOffRequestList](TimeOffRequestList.md) postWorkforcemanagementManagementunitTimeoffrequests(managementUnitId, body)

Create a new time off request

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeoffrequests

Requires ANY permissions:

- wfm:timeOffRequest:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
CreateAdminTimeOffRequest body = new CreateAdminTimeOffRequest(); // CreateAdminTimeOffRequest | body
try {
    TimeOffRequestList result = apiInstance.postWorkforcemanagementManagementunitTimeoffrequests(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitTimeoffrequests");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                          | Description                                                                                       | Notes      |
| -------------------- | ------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                    | The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **body**             | [**CreateAdminTimeOffRequest**](CreateAdminTimeOffRequest.md) | body                                                                                              | [optional] |

{: class="table-striped"}

### Return type

[**TimeOffRequestList**](TimeOffRequestList.md)

<a name="postWorkforcemanagementManagementunitTimeoffrequestsQuery"></a>

# **postWorkforcemanagementManagementunitTimeoffrequestsQuery**

> [TimeOffRequestListing](TimeOffRequestListing.md) postWorkforcemanagementManagementunitTimeoffrequestsQuery(managementUnitId, body)

Fetches time off requests matching the conditions specified in the request body

Request body requires one of the following: User ID is specified, statuses == [Pending] or date range to be specified and less than or equal to 33 days. All other fields are filters

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeoffrequests/query

Requires ANY permissions:

- wfm:timeOffRequest:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The muId of the management unit, or 'mine' for the management unit of the logged-in user.
TimeOffRequestQueryBody body = new TimeOffRequestQueryBody(); // TimeOffRequestQueryBody | body
try {
    TimeOffRequestListing result = apiInstance.postWorkforcemanagementManagementunitTimeoffrequestsQuery(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitTimeoffrequestsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                      | Description                                                                                       | Notes      |
| -------------------- | --------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                | The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **body**             | [**TimeOffRequestQueryBody**](TimeOffRequestQueryBody.md) | body                                                                                              | [optional] |

{: class="table-striped"}

### Return type

[**TimeOffRequestListing**](TimeOffRequestListing.md)

<a name="postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery"></a>

# **postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery**

> [WaitlistPositionListing](WaitlistPositionListing.md) postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery(managementUnitId, body)

Retrieves daily waitlist position for a list of time off requests

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeoffrequests/waitlistpositions/query

Requires ANY permissions:

- wfm:timeOffRequest:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit.
QueryWaitlistPositionsRequest body = new QueryWaitlistPositionsRequest(); // QueryWaitlistPositionsRequest | body
try {
    WaitlistPositionListing result = apiInstance.postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                                  | Description                                    | Notes      |
| -------------------- | --------------------------------------------------------------------- | ---------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                            | The management unit ID of the management unit. |
| **body**             | [**QueryWaitlistPositionsRequest**](QueryWaitlistPositionsRequest.md) | body                                           | [optional] |

{: class="table-striped"}

### Return type

[**WaitlistPositionListing**](WaitlistPositionListing.md)

<a name="postWorkforcemanagementManagementunitWeekShifttradeMatch"></a>

# **postWorkforcemanagementManagementunitWeekShifttradeMatch**

> [MatchShiftTradeResponse](MatchShiftTradeResponse.md) postWorkforcemanagementManagementunitWeekShifttradeMatch(managementUnitId, weekDateId, body, tradeId)

Matches a shift trade. This route can only be called by the receiving agent

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/weeks/{weekDateId}/shifttrades/{tradeId}/match

Requires ANY permissions:

- wfm:agentShiftTradeRequest:participate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
LocalDate weekDateId = new LocalDate(); // LocalDate | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
MatchShiftTradeRequest body = new MatchShiftTradeRequest(); // MatchShiftTradeRequest | body
String tradeId = "tradeId_example"; // String | The ID of the shift trade to update
try {
    MatchShiftTradeResponse result = apiInstance.postWorkforcemanagementManagementunitWeekShifttradeMatch(managementUnitId, weekDateId, body, tradeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitWeekShifttradeMatch");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                    | Description                                                                                                                    | Notes |
| -------------------- | ------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------ | ----- |
| **managementUnitId** | **String**                                              | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user.                |
| **weekDateId**       | **LocalDate**                                           | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**             | [**MatchShiftTradeRequest**](MatchShiftTradeRequest.md) | body                                                                                                                           |
| **tradeId**          | **String**                                              | The ID of the shift trade to update                                                                                            |

{: class="table-striped"}

### Return type

[**MatchShiftTradeResponse**](MatchShiftTradeResponse.md)

<a name="postWorkforcemanagementManagementunitWeekShifttrades"></a>

# **postWorkforcemanagementManagementunitWeekShifttrades**

> [ShiftTradeResponse](ShiftTradeResponse.md) postWorkforcemanagementManagementunitWeekShifttrades(managementUnitId, weekDateId, body)

Adds a shift trade

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/weeks/{weekDateId}/shifttrades

Requires ANY permissions:

- wfm:agentShiftTradeRequest:participate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
LocalDate weekDateId = new LocalDate(); // LocalDate | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
AddShiftTradeRequest body = new AddShiftTradeRequest(); // AddShiftTradeRequest | body
try {
    ShiftTradeResponse result = apiInstance.postWorkforcemanagementManagementunitWeekShifttrades(managementUnitId, weekDateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitWeekShifttrades");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                | Description                                                                                                                    | Notes |
| -------------------- | --------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------ | ----- |
| **managementUnitId** | **String**                                          | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user.                |
| **weekDateId**       | **LocalDate**                                       | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**             | [**AddShiftTradeRequest**](AddShiftTradeRequest.md) | body                                                                                                                           |

{: class="table-striped"}

### Return type

[**ShiftTradeResponse**](ShiftTradeResponse.md)

<a name="postWorkforcemanagementManagementunitWeekShifttradesSearch"></a>

# **postWorkforcemanagementManagementunitWeekShifttradesSearch**

> [SearchShiftTradesResponse](SearchShiftTradesResponse.md) postWorkforcemanagementManagementunitWeekShifttradesSearch(managementUnitId, weekDateId, body)

Searches for potential shift trade matches for the current agent

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/weeks/{weekDateId}/shifttrades/search

Requires ANY permissions:

- wfm:agentShiftTradeRequest:participate

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
LocalDate weekDateId = new LocalDate(); // LocalDate | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
SearchShiftTradesRequest body = new SearchShiftTradesRequest(); // SearchShiftTradesRequest | body
try {
    SearchShiftTradesResponse result = apiInstance.postWorkforcemanagementManagementunitWeekShifttradesSearch(managementUnitId, weekDateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitWeekShifttradesSearch");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                        | Description                                                                                                                    | Notes |
| -------------------- | ----------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------ | ----- |
| **managementUnitId** | **String**                                                  | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user.                |
| **weekDateId**       | **LocalDate**                                               | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**             | [**SearchShiftTradesRequest**](SearchShiftTradesRequest.md) | body                                                                                                                           |

{: class="table-striped"}

### Return type

[**SearchShiftTradesResponse**](SearchShiftTradesResponse.md)

<a name="postWorkforcemanagementManagementunitWeekShifttradesStateBulk"></a>

# **postWorkforcemanagementManagementunitWeekShifttradesStateBulk**

> [BulkUpdateShiftTradeStateResponse](BulkUpdateShiftTradeStateResponse.md) postWorkforcemanagementManagementunitWeekShifttradesStateBulk(managementUnitId, weekDateId, body, forceAsync)

Updates the state of a batch of shift trades

Admin functionality is not supported with \&quot;mine\&quot;.

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/weeks/{weekDateId}/shifttrades/state/bulk

Requires ANY permissions:

- wfm:agentShiftTradeRequest:participate
- wfm:shiftTradeRequest:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit, or 'mine' for the management unit of the logged-in user.
LocalDate weekDateId = new LocalDate(); // LocalDate | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
BulkShiftTradeStateUpdateRequest body = new BulkShiftTradeStateUpdateRequest(); // BulkShiftTradeStateUpdateRequest | body
Boolean forceAsync = true; // Boolean | Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes
try {
    BulkUpdateShiftTradeStateResponse result = apiInstance.postWorkforcemanagementManagementunitWeekShifttradesStateBulk(managementUnitId, weekDateId, body, forceAsync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitWeekShifttradesStateBulk");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                                        | Description                                                                                                                    | Notes      |
| -------------------- | --------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **managementUnitId** | **String**                                                                  | The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user.                |
| **weekDateId**       | **LocalDate**                                                               | The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **body**             | [**BulkShiftTradeStateUpdateRequest**](BulkShiftTradeStateUpdateRequest.md) | body                                                                                                                           |
| **forceAsync**       | **Boolean**                                                                 | Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes            | [optional] |

{: class="table-striped"}

### Return type

[**BulkUpdateShiftTradeStateResponse**](BulkUpdateShiftTradeStateResponse.md)

<a name="postWorkforcemanagementManagementunitWorkplanCopy"></a>

# **postWorkforcemanagementManagementunitWorkplanCopy**

> [WorkPlan](WorkPlan.md) postWorkforcemanagementManagementunitWorkplanCopy(managementUnitId, workPlanId, body)

Create a copy of work plan

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplans/{workPlanId}/copy

Requires ANY permissions:

- wfm:workPlan:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String workPlanId = "workPlanId_example"; // String | The ID of the work plan to create a copy
CopyWorkPlan body = new CopyWorkPlan(); // CopyWorkPlan | body
try {
    WorkPlan result = apiInstance.postWorkforcemanagementManagementunitWorkplanCopy(managementUnitId, workPlanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitWorkplanCopy");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                | Description                                                                                     | Notes      |
| -------------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId** | **String**                          | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **workPlanId**       | **String**                          | The ID of the work plan to create a copy                                                        |
| **body**             | [**CopyWorkPlan**](CopyWorkPlan.md) | body                                                                                            | [optional] |

{: class="table-striped"}

### Return type

[**WorkPlan**](WorkPlan.md)

<a name="postWorkforcemanagementManagementunitWorkplanValidate"></a>

# **postWorkforcemanagementManagementunitWorkplanValidate**

> [ValidateWorkPlanResponse](ValidateWorkPlanResponse.md) postWorkforcemanagementManagementunitWorkplanValidate(managementUnitId, workPlanId, body, expand)

Validate Work Plan

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplans/{workPlanId}/validate

Requires ANY permissions:

- wfm:workPlan:add
- wfm:workPlan:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String workPlanId = "workPlanId_example"; // String | The ID of the work plan to validate. For new work plan, use the word 'new' for the ID.
WorkPlanValidationRequest body = new WorkPlanValidationRequest(); // WorkPlanValidationRequest | body
List<String> expand = Arrays.asList("expand_example"); // List<String> |
try {
    ValidateWorkPlanResponse result = apiInstance.postWorkforcemanagementManagementunitWorkplanValidate(managementUnitId, workPlanId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitWorkplanValidate");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                          | Description                                                                                     | Notes                                |
| -------------------- | ------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ------------------------------------ |
| **managementUnitId** | **String**                                                    | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **workPlanId**       | **String**                                                    | The ID of the work plan to validate. For new work plan, use the word &#39;new&#39; for the ID.  |
| **body**             | [**WorkPlanValidationRequest**](WorkPlanValidationRequest.md) | body                                                                                            | [optional]                           |
| **expand**           | [**List&lt;String&gt;**](String.md)                           |                                                                                                 | [optional]<br />**Values**: messages |

{: class="table-striped"}

### Return type

[**ValidateWorkPlanResponse**](ValidateWorkPlanResponse.md)

<a name="postWorkforcemanagementManagementunitWorkplanrotationCopy"></a>

# **postWorkforcemanagementManagementunitWorkplanrotationCopy**

> [WorkPlanRotationResponse](WorkPlanRotationResponse.md) postWorkforcemanagementManagementunitWorkplanrotationCopy(managementUnitId, workPlanRotationId, body)

Create a copy of work plan rotation

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplanrotations/{workPlanRotationId}/copy

Requires ANY permissions:

- wfm:workPlanRotation:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
String workPlanRotationId = "workPlanRotationId_example"; // String | The ID of the work plan rotation to create a copy
CopyWorkPlanRotationRequest body = new CopyWorkPlanRotationRequest(); // CopyWorkPlanRotationRequest | body
try {
    WorkPlanRotationResponse result = apiInstance.postWorkforcemanagementManagementunitWorkplanrotationCopy(managementUnitId, workPlanRotationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitWorkplanrotationCopy");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type                                                              | Description                                                                                     | Notes      |
| ---------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId**   | **String**                                                        | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **workPlanRotationId** | **String**                                                        | The ID of the work plan rotation to create a copy                                               |
| **body**               | [**CopyWorkPlanRotationRequest**](CopyWorkPlanRotationRequest.md) | body                                                                                            | [optional] |

{: class="table-striped"}

### Return type

[**WorkPlanRotationResponse**](WorkPlanRotationResponse.md)

<a name="postWorkforcemanagementManagementunitWorkplanrotations"></a>

# **postWorkforcemanagementManagementunitWorkplanrotations**

> [WorkPlanRotationResponse](WorkPlanRotationResponse.md) postWorkforcemanagementManagementunitWorkplanrotations(managementUnitId, body)

Create a new work plan rotation

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplanrotations

Requires ANY permissions:

- wfm:workPlanRotation:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
AddWorkPlanRotationRequest body = new AddWorkPlanRotationRequest(); // AddWorkPlanRotationRequest | body
try {
    WorkPlanRotationResponse result = apiInstance.postWorkforcemanagementManagementunitWorkplanrotations(managementUnitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitWorkplanrotations");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                            | Description                                                                                     | Notes      |
| -------------------- | --------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                      | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **body**             | [**AddWorkPlanRotationRequest**](AddWorkPlanRotationRequest.md) | body                                                                                            | [optional] |

{: class="table-striped"}

### Return type

[**WorkPlanRotationResponse**](WorkPlanRotationResponse.md)

<a name="postWorkforcemanagementManagementunitWorkplans"></a>

# **postWorkforcemanagementManagementunitWorkplans**

> [WorkPlan](WorkPlan.md) postWorkforcemanagementManagementunitWorkplans(managementUnitId, body, validationMode)

Create a new work plan

Wraps POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplans

Requires ANY permissions:

- wfm:workPlan:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The ID of the management unit, or 'mine' for the management unit of the logged-in user.
CreateWorkPlan body = new CreateWorkPlan(); // CreateWorkPlan | body
String validationMode = "validationMode_example"; // String | Allows to create work plan even if the validation result is invalid
try {
    WorkPlan result = apiInstance.postWorkforcemanagementManagementunitWorkplans(managementUnitId, body, validationMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunitWorkplans");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                    | Description                                                                                     | Notes                              |
| -------------------- | --------------------------------------- | ----------------------------------------------------------------------------------------------- | ---------------------------------- |
| **managementUnitId** | **String**                              | The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. |
| **body**             | [**CreateWorkPlan**](CreateWorkPlan.md) | body                                                                                            | [optional]                         |
| **validationMode**   | **String**                              | Allows to create work plan even if the validation result is invalid                             | [optional]<br />**Values**: Ignore |

{: class="table-striped"}

### Return type

[**WorkPlan**](WorkPlan.md)

<a name="postWorkforcemanagementManagementunits"></a>

# **postWorkforcemanagementManagementunits**

> [ManagementUnit](ManagementUnit.md) postWorkforcemanagementManagementunits(body)

Add a management unit

It may take a minute or two for a new management unit to be available for api operations

Wraps POST /api/v2/workforcemanagement/managementunits

Requires ALL permissions:

- wfm:managementUnit:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
CreateManagementUnitApiRequest body = new CreateManagementUnitApiRequest(); // CreateManagementUnitApiRequest | body
try {
    ManagementUnit result = apiInstance.postWorkforcemanagementManagementunits(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementManagementunits");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                    | Description | Notes      |
| -------- | ----------------------------------------------------------------------- | ----------- | ---------- |
| **body** | [**CreateManagementUnitApiRequest**](CreateManagementUnitApiRequest.md) | body        | [optional] |

{: class="table-striped"}

### Return type

[**ManagementUnit**](ManagementUnit.md)

<a name="postWorkforcemanagementNotificationsUpdate"></a>

# **postWorkforcemanagementNotificationsUpdate**

> [UpdateNotificationsResponse](UpdateNotificationsResponse.md) postWorkforcemanagementNotificationsUpdate(body)

Mark a list of notifications as read or unread

Wraps POST /api/v2/workforcemanagement/notifications/update

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
UpdateNotificationsRequest body = new UpdateNotificationsRequest(); // UpdateNotificationsRequest | body
try {
    UpdateNotificationsResponse result = apiInstance.postWorkforcemanagementNotificationsUpdate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementNotificationsUpdate");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                            | Description | Notes      |
| -------- | --------------------------------------------------------------- | ----------- | ---------- |
| **body** | [**UpdateNotificationsRequest**](UpdateNotificationsRequest.md) | body        | [optional] |

{: class="table-striped"}

### Return type

[**UpdateNotificationsResponse**](UpdateNotificationsResponse.md)

<a name="postWorkforcemanagementSchedules"></a>

# **postWorkforcemanagementSchedules**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [UserScheduleContainer](UserScheduleContainer.md) postWorkforcemanagementSchedules(body)

Get published schedule for the current user

Wraps POST /api/v2/workforcemanagement/schedules

Requires ANY permissions:

- wfm:agentSchedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
CurrentUserScheduleRequestBody body = new CurrentUserScheduleRequestBody(); // CurrentUserScheduleRequestBody | body
try {
    UserScheduleContainer result = apiInstance.postWorkforcemanagementSchedules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementSchedules");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                    | Description | Notes      |
| -------- | ----------------------------------------------------------------------- | ----------- | ---------- |
| **body** | [**CurrentUserScheduleRequestBody**](CurrentUserScheduleRequestBody.md) | body        | [optional] |

{: class="table-striped"}

### Return type

[**UserScheduleContainer**](UserScheduleContainer.md)

<a name="postWorkforcemanagementTimeofflimitsAvailableQuery"></a>

# **postWorkforcemanagementTimeofflimitsAvailableQuery**

> [AvailableTimeOffResponse](AvailableTimeOffResponse.md) postWorkforcemanagementTimeofflimitsAvailableQuery(body)

Queries available time off for the current user

Wraps POST /api/v2/workforcemanagement/timeofflimits/available/query

Requires ANY permissions:

- wfm:agentTimeOffRequest:submit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
AvailableTimeOffRequest body = new AvailableTimeOffRequest(); // AvailableTimeOffRequest | body
try {
    AvailableTimeOffResponse result = apiInstance.postWorkforcemanagementTimeofflimitsAvailableQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementTimeofflimitsAvailableQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                      | Description | Notes      |
| -------- | --------------------------------------------------------- | ----------- | ---------- |
| **body** | [**AvailableTimeOffRequest**](AvailableTimeOffRequest.md) | body        | [optional] |

{: class="table-striped"}

### Return type

[**AvailableTimeOffResponse**](AvailableTimeOffResponse.md)

<a name="postWorkforcemanagementTimeoffrequests"></a>

# **postWorkforcemanagementTimeoffrequests**

> [TimeOffRequestResponse](TimeOffRequestResponse.md) postWorkforcemanagementTimeoffrequests(body)

Create a time off request for the current user

Wraps POST /api/v2/workforcemanagement/timeoffrequests

Requires ANY permissions:

- wfm:agentTimeOffRequest:submit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
CreateAgentTimeOffRequest body = new CreateAgentTimeOffRequest(); // CreateAgentTimeOffRequest | body
try {
    TimeOffRequestResponse result = apiInstance.postWorkforcemanagementTimeoffrequests(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#postWorkforcemanagementTimeoffrequests");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                          | Description | Notes      |
| -------- | ------------------------------------------------------------- | ----------- | ---------- |
| **body** | [**CreateAgentTimeOffRequest**](CreateAgentTimeOffRequest.md) | body        | [optional] |

{: class="table-striped"}

### Return type

[**TimeOffRequestResponse**](TimeOffRequestResponse.md)

<a name="putWorkforcemanagementManagementunitTimeofflimitValues"></a>

# **putWorkforcemanagementManagementunitTimeofflimitValues**

> [TimeOffLimit](TimeOffLimit.md) putWorkforcemanagementManagementunitTimeofflimitValues(managementUnitId, timeOffLimitId, body)

Sets daily values for a date range of time off limit object

Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time off limit API

Wraps PUT /api/v2/workforcemanagement/managementunits/{managementUnitId}/timeofflimits/{timeOffLimitId}/values

Requires ANY permissions:

- wfm:timeOffLimit:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WorkforceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WorkforceManagementApi apiInstance = new WorkforceManagementApi();
String managementUnitId = "managementUnitId_example"; // String | The management unit ID of the management unit.
String timeOffLimitId = "timeOffLimitId_example"; // String | The ID of the time off limit object to set values for
SetTimeOffLimitValuesRequest body = new SetTimeOffLimitValuesRequest(); // SetTimeOffLimitValuesRequest | body
try {
    TimeOffLimit result = apiInstance.putWorkforcemanagementManagementunitTimeofflimitValues(managementUnitId, timeOffLimitId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkforceManagementApi#putWorkforcemanagementManagementunitTimeofflimitValues");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                                                | Description                                           | Notes      |
| -------------------- | ------------------------------------------------------------------- | ----------------------------------------------------- | ---------- |
| **managementUnitId** | **String**                                                          | The management unit ID of the management unit.        |
| **timeOffLimitId**   | **String**                                                          | The ID of the time off limit object to set values for |
| **body**             | [**SetTimeOffLimitValuesRequest**](SetTimeOffLimitValuesRequest.md) | body                                                  | [optional] |

{: class="table-striped"}

### Return type

[**TimeOffLimit**](TimeOffLimit.md)
