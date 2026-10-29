.class public final synthetic LG7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:LJ7/i;


# direct methods
.method public synthetic constructor <init>(ZLJ7/i;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LG7/c;->q:Z

    iput-object p2, p0, LG7/c;->r:LJ7/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-boolean v0, p0, LG7/c;->q:Z

    iget-object p0, p0, LG7/c;->r:LJ7/i;

    invoke-static {v0, p0}, LG7/d;->c(ZLJ7/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
