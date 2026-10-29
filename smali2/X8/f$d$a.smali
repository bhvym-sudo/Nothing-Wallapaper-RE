.class public final LX8/f$d$a;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f$d;->q(ZLX8/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;

.field final synthetic f:Lkotlin/jvm/internal/E;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f;Lkotlin/jvm/internal/E;)V
    .registers 5

    iput-object p3, p0, LX8/f$d$a;->e:LX8/f;

    iput-object p4, p0, LX8/f$d$a;->f:Lkotlin/jvm/internal/E;

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 3

    iget-object v0, p0, LX8/f$d$a;->e:LX8/f;

    invoke-virtual {v0}, LX8/f;->T0()LX8/f$c;

    move-result-object v0

    iget-object v1, p0, LX8/f$d$a;->e:LX8/f;

    iget-object p0, p0, LX8/f$d$a;->f:Lkotlin/jvm/internal/E;

    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, LX8/m;

    invoke-virtual {v0, v1, p0}, LX8/f$c;->b(LX8/f;LX8/m;)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
