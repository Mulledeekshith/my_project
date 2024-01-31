import { Component } from '@angular/core';
import { Job } from '../../common/job';
import { JobService } from '../../service/job.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-employer-jobs',
  templateUrl: './employer-jobs.component.html',
  styleUrl: './employer-jobs.component.css'
})
export class EmployerJobsComponent {
  jobs:Job[]=[];
  currentEmployerId:number|null|string=1
  constructor(private service:JobService, private route:ActivatedRoute){}
  ngOnInit(){
    this.route.paramMap.subscribe(()=>{
      this.displayEmployerJobs();
    })
  }
  displayEmployerJobs(){
    this.service.getEmployerJob(this.currentEmployerId).subscribe((data)=>{
this.jobs=data
    })
  
  }

}
