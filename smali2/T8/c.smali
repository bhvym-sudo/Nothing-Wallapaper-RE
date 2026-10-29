.class public final LT8/c;
.super LT8/a;
.source "SourceFile"


# instance fields
.field final synthetic e:Lv8/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLv8/a;)V
    .registers 4

    iput-object p3, p0, LT8/c;->e:Lv8/a;

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 3

    iget-object p0, p0, LT8/c;->e:Lv8/a;

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    const-wide/16 v0, -0x1

    return-wide v0
.end method
