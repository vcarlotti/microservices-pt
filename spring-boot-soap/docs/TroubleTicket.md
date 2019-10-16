
# TroubleTicket

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**correlationId** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**severity** | **String** |  |  [optional]
**type** | **String** |  |  [optional]
**creationDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**targetResolutionDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**statusChangeReason** | **String** |  | 
**statusChangeDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) |  |  [optional]
**relatedObject** | [**List&lt;RelatedObject&gt;**](RelatedObject.md) |  |  [optional]
**note** | [**List&lt;Note&gt;**](Note.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUBMITTED | &quot;Submitted&quot;
REJECTED | &quot;Rejected&quot;
ACKNOWLEDGED | &quot;Acknowledged&quot;
INPROGRESS | &quot;InProgress&quot;
INPROGRESSHELD | &quot;InProgressHeld&quot;
INPROGRESSPENDING | &quot;InProgressPending&quot;
RESOLVED | &quot;Resolved&quot;
CLOSED | &quot;Closed&quot;
CANCELLED | &quot;Cancelled&quot;



