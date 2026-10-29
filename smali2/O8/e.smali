.class public final synthetic LO8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LO8/f;

.field public final synthetic r:LO8/f$a;


# direct methods
.method public synthetic constructor <init>(LO8/f;LO8/f$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO8/e;->q:LO8/f;

    iput-object p2, p0, LO8/e;->r:LO8/f$a;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, LO8/e;->q:LO8/f;

    iget-object p0, p0, LO8/e;->r:LO8/f$a;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p0, p1}, LO8/f$a;->d(LO8/f;LO8/f$a;Ljava/lang/Throwable;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
