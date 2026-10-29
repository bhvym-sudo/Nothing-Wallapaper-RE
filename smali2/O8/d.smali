.class public final synthetic LO8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# instance fields
.field public final synthetic q:LO8/f;

.field public final synthetic r:LO8/f$a;


# direct methods
.method public synthetic constructor <init>(LO8/f;LO8/f$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO8/d;->q:LO8/f;

    iput-object p2, p0, LO8/d;->r:LO8/f$a;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    iget-object v0, p0, LO8/d;->q:LO8/f;

    iget-object p0, p0, LO8/d;->r:LO8/f$a;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lh8/A;

    check-cast p3, Lm8/i;

    invoke-static {v0, p0, p1, p2, p3}, LO8/f$a;->c(LO8/f;LO8/f$a;Ljava/lang/Throwable;Lh8/A;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
