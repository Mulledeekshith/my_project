import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { JobApplications } from '../common/job-applications';

@Injectable({
  providedIn: 'root'
})
export class JobApplicationsService {
baseUrl="http://localhost:8181/myapp/jobApplication"
jobsUrl="http://localhost:8181/myapp"
  constructor(private http:HttpClient) { }

  getAllJobApplications():Observable<JobApplications[]>{
    return this.http.get<JobApplications[]>(`${this.baseUrl}`);
  }
  getEmployeeJobs(theEmployeeId:Number|String|null):Observable<JobApplications[]>{
    const employeeJobUrl=`${this.jobsUrl}/jae/${theEmployeeId}`
    return this.http.get<JobApplications[]>(employeeJobUrl);
  }
}
