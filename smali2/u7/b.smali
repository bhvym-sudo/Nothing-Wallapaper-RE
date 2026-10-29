.class public final synthetic Lu7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lu7/a;

.field public final synthetic r:Lu7/a$c$a;


# direct methods
.method public synthetic constructor <init>(Lu7/a;Lu7/a$c$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu7/b;->q:Lu7/a;

    iput-object p2, p0, Lu7/b;->r:Lu7/a$c$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Lu7/b;->q:Lu7/a;

    iget-object p0, p0, Lu7/b;->r:Lu7/a$c$a;

    invoke-static {v0, p0}, Lu7/a$c;->s(Lu7/a;Lu7/a$c$a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
