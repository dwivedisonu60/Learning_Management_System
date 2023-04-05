import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LMSMentorComponent } from './lms-mentor.component';

describe('LMSMentorComponent', () => {
  let component: LMSMentorComponent;
  let fixture: ComponentFixture<LMSMentorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LMSMentorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LMSMentorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
