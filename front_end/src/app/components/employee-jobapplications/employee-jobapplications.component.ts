import { Component } from '@angular/core';
import { JobApplications } from '../../common/job-applications';
import { JobService } from '../../service/job.service';
import { JobApplicationsService } from '../../service/job-applications.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-employee-jobapplications',
  templateUrl: './employee-jobapplications.component.html',
  styleUrl: './employee-jobapplications.component.css'
})
export class EmployeeJobapplicationsComponent {
  jobApplications:JobApplications[]=[];
  currentEmployeeId:number|null|string=1
  constructor(private service:JobApplicationsService, private route:ActivatedRoute){}
ngOnInit(){
  this.route.paramMap.subscribe(()=>{
    this.displayEmployeeJobApplications();
  })
}

  displayEmployeeJobApplications(){
    this.service.getEmployeeJobs(this.currentEmployeeId).subscribe((data)=>{
      this.jobApplications=data
    })
  }
}
