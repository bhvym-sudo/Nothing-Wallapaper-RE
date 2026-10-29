.class public final synthetic LG7/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LK6/c;

.field public final synthetic r:Lb/j;


# direct methods
.method public synthetic constructor <init>(LK6/c;Lb/j;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG7/q;->q:LK6/c;

    iput-object p2, p0, LG7/q;->r:Lb/j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, LG7/q;->q:LK6/c;

    iget-object p0, p0, LG7/q;->r:Lb/j;

    invoke-static {v0, p0}, LG7/s;->a(LK6/c;Lb/j;)Landroidx/lifecycle/d0$c;

    move-result-object p0

    return-object p0
.end method
