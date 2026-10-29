.class final LG7/s$f$a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/s$f$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LH7/d;

.field final synthetic r:LS1/a;


# direct methods
.method constructor <init>(LH7/d;LS1/a;)V
    .registers 3

    iput-object p1, p0, LG7/s$f$a$c$a;->q:LH7/d;

    iput-object p2, p0, LG7/s$f$a$c$a;->r:LS1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p2, p0, LG7/s$f$a$c$a;->q:LH7/d;

    iget-object p0, p0, LG7/s$f$a$c$a;->r:LS1/a;

    invoke-virtual {p2, p0, p1}, LH7/d;->u(LS1/a;Ljava/lang/String;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, LG7/s$f$a$c$a;->a(Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
