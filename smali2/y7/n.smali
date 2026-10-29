.class public final synthetic Ly7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lv8/a;

.field public final synthetic r:Ly7/o;

.field public final synthetic s:Z


# direct methods
.method public synthetic constructor <init>(Lv8/a;Ly7/o;Z)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/n;->q:Lv8/a;

    iput-object p2, p0, Ly7/n;->r:Ly7/o;

    iput-boolean p3, p0, Ly7/n;->s:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Ly7/n;->q:Lv8/a;

    iget-object v1, p0, Ly7/n;->r:Ly7/o;

    iget-boolean p0, p0, Ly7/n;->s:Z

    invoke-static {v0, v1, p0}, Ly7/o;->a(Lv8/a;Ly7/o;Z)V

    return-void
.end method
