import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VehiculoNewComponent } from './vehiculo-new.component';

describe('VehiculoNewComponent', () => {
  let component: VehiculoNewComponent;
  let fixture: ComponentFixture<VehiculoNewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VehiculoNewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VehiculoNewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
